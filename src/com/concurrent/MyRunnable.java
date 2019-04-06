package com.concurrent;

public class MyRunnable implements Runnable {
    private boolean doStop = false;

    public synchronized void doStop() {
        this.doStop = true;
    }

    private synchronized boolean keepRunning() {
        return !this.doStop;
    }

    @Override
    public void run() {
        System.out.println("1");
        while (keepRunning()) {
            System.out.println("2");
            try {
                System.out.println("3");
                Thread.sleep(1L * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("4");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        System.out.println("5");

        Thread thread = new Thread(myRunnable);
        thread.start();

        try {
            System.out.println("6");
            Thread.sleep(2L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("7");
        myRunnable.doStop();

        System.out.println("8");
    }
}
