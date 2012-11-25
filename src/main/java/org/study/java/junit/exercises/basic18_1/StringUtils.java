package org.study.java.junit.exercises.basic18_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    /**
     * 引数の文字列をスネークケース(すべて小文字で単語区切りがアンダースコア)に変換した文字列を返す
     * @param src 元の文字列
     * @return スネークケースに変換した文字列
     * 
     * (e.g.)
     * aaa -> aaa
     * HelloWorld -> hello_world
     * practiceJunit -> practice_junit
     */
    public static String toSnakeCase(String src) {
        StringBuilder ret = new StringBuilder(src);
        
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(src);
        
        while(m.find()) {
            int upperCaseIdx = m.start();
            
            // 最初の文字の前には_を挿入しない
            if (upperCaseIdx <= 0) continue;
            
            ret.insert(upperCaseIdx, "_");
        }
        
        return ret.toString().toLowerCase();
    }

}
