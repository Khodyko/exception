package com.company.web;

public class Task14Thread implements Runnable, Thread.UncaughtExceptionHandler{
    @Override
    public void run() {

    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        e.printStackTrace();
    }
}
