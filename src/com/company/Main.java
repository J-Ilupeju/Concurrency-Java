package com.company;

public class Main {

    private static Letters letterPool = new LettersImplementation();

    public static void main(String[] args) {
	// write your code here
            new Producer(letterPool, "Juliet").start();
            new Producer(letterPool, "Providence").start();
            new Producer(letterPool, "Innocent").start();
            new Producer(letterPool, "Woode").start();

    }
}
