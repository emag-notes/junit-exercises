package org.study.java.junit.exercises.basic18_6;

import java.util.concurrent.Executors;

public class BackgroundTask {

    private final Runnable task_;
    
    public BackgroundTask(Runnable task) {
        task_ = task;
    }

    public void invoke() {
        Executors.newSingleThreadExecutor().execute(task_);
    }

}
