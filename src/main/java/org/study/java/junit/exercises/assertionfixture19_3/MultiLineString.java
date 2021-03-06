package org.study.java.junit.exercises.assertionfixture19_3;

public class MultiLineString {

    public static String join(String... lines) {
        if (lines == null) return null;
        String lineSeparator = System.getProperty("line.separator");
        StringBuilder text = new StringBuilder();
        for (String line : lines) {
            text.append(line != null ? line : "").append(lineSeparator);
        }
        return text.toString();
    }

}
