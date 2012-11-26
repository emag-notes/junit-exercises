package org.study.java.junit.exercises.basic18_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    /**
     * <p>
     * 引数の文字列をスネークケース(すべて小文字で単語区切りがアンダースコア)に変換した文字列を返す。
     * null が与えられたときは null を返す。
     * </p>
     * (e.g.)
     * <ul>
     * <li>aaa -> aaa</li>
     * <li>HelloWorld -> hello_world</li>
     * <li>practiceJunit -> practice_junit</li>
     * </ul>
     * @param src 元の文字列
     * @return スネークケースに変換した文字列
     * 
     */
    public static String toSnakeCase(String src) {
        if (src == null) return null;
        
        StringBuilder toSnakeCasedStr = new StringBuilder(src);
        
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(src);
        
        while(m.find()) {
            int upperCaseIdx = m.start();
            
            // 最初の文字の前には_を挿入しない
            if (upperCaseIdx <= 0) continue;
            
            toSnakeCasedStr.insert(upperCaseIdx, "_");
        }
        
        return toSnakeCasedStr.toString().toLowerCase();
    }

}
