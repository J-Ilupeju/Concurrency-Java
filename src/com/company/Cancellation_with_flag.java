package com.company;

public class Cancellation_with_flag {

    public static volatile  boolean isRunning = true;

    public static void main(String[] args) throws InterruptedException {


        Thread helloThread = new Thread(() -> {

            while(isRunning) {
                System.out.println("Hello world, go away  " + isRunning);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        helloThread.start();

        Thread.sleep(5000);
        isRunning = false;
        System.out.println("Set is Running to " + isRunning);
    }
}


