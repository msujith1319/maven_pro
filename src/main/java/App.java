package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Application started successfully");
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
