package org.study.java.junit.exercises.basic18_3;

public class Counter {

    private int counter_;
    
    /**
     * 実行するたびに1ずつ加算された値(初回の呼び出しは1)を返す。
     * @return 現在のカウントから +1 された値
     */
    public int increment() {
        return ++counter_;
    }

}
