package org.study.java.junit.exercises.assertionfixture19_3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class MultiLineStringMatcher extends BaseMatcher<String>{

    public static Matcher<String> text(String text) {
        return new MultiLineStringMatcher(text, System.getProperty("line.separator"));
    }
    
    private final String expected_;
    private Object actual_;
    private final List<String> expectedLines_ = new ArrayList<String>();
    private final List<String> actualLines_   = new ArrayList<String>();
    private final Pattern pattern_;
    
    public MultiLineStringMatcher(String expected, String ls) {
        expected_ = expected;
        if (ls.equals("\r")) {
            pattern_ = Pattern.compile(".+(\\r|$)");
        } else if (ls.equals("\n")) {
            pattern_ = Pattern.compile(".+(\\n|$)");
        } else {
            pattern_ = Pattern.compile(".+(\\r\\n|$)");
        }
        if (expected != null) {
            java.util.regex.Matcher m = pattern_.matcher(expected);
            while(m.find()) {
                expectedLines_.add(expected.substring(m.start(), m.end()));
            }
        }
    }
    
    @Override
    public boolean matches(Object actual) {
        actual_ = actual;
        if (expected_ == null) return (actual == null);
        if (!(actual instanceof String)) return false;
        if (expected_.equals(actual)) return true;
        String actualString = (String) actual;
        java.util.regex.Matcher m = pattern_.matcher(actualString);
        while(m.find()) {
            actualLines_.add(actualString.substring(m.start(), m.end()));
        }
        return expectedLines_.equals(actual_);
    }

    @Override
    public void describeTo(Description desc) {
        if (expected_ == null || actual_ == null) {
            desc.appendValue(expected_);
        } else {
            int lines = Math.min(expectedLines_.size(), actualLines_.size());
            for (int idx = 0; idx < lines; idx++) {
                String expectedLine = expectedLines_.get(idx);
                String actualLine   = actualLines_.get(idx);
                if (!expectedLine.equals(actualLine)) {
                    desc.appendValue(expectedLine);
                    desc.appendText(", but actual is ");
                    desc.appendValue(actualLine);
                    desc.appendText(", line " + (idx+1) + "\n");
                    desc.appendValue(expected_);
                    return;
                }
            }
            desc.appendText("expected text is " + expectedLines_.size() + " lines, ");
            desc.appendText("but actual text is " + actualLines_.size() + " lines\n");
            desc.appendValue(expected_);
        }
        
    }

}
