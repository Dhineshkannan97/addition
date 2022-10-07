package com.example.sample;

public class Addition {

    public static int add(int a, int b){
        return a+b;
    }

    public static int parser (String param){
        return Integer.parseInt(param);
    }

    //Employee
    //API - http://Employee
    //Employee object

    public static void main(String[] args) {
        System.out.println(add(1,2));

    }
}
