package com.planb.thread;

import android.app.Activity;
import android.os.Bundle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class TestThreadPoolActivity extends Activity {
    ExecutorService executorService1 = new ThreadPoolExecutor(5, 5,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());
    static ExecutorService executorService2 =  new ThreadPoolExecutor(5, 5,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        executorService1.submit(new Runnable() {
            @Override
            public void run() {

            }
        });

    }


    public void test() {
        ExecutorService executorService =  new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test For Executors.newCachedThreadPool");
            }
        });
    }

    public void test2() {
        new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>()).submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test For Executors.newFixedThreadPool");
            }
        });
    }

    public void test3() {
        executorService2.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
