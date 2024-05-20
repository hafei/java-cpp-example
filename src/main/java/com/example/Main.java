package com.example;


import com.sun.jna.Library;
import com.sun.jna.Native;

public class Main {
    public interface ExampleLibrary extends Library {
        int add(int a, int b);
    }

    public static void main(String[] args) {
        ExampleLibrary lib = Native.load("mylib", ExampleLibrary.class);
        int result = lib.add(3, 4);
        System.out.println("Result: " + result);
        System.out.println("hello world");
    }
}