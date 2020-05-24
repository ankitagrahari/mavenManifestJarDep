package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Arguments Size:"+ args.length);
        System.out.println("Arguments provided are");
        for(String s: args){
            System.out.println(s);
        }
    }
}
