package com.saurabh.example.designpatterns.creational.builder;

public class AppMain {
    public static void main(String[] args) {
        Fee fee=new FeeBuilder()
                .setFeeName("Bank Fee")
                .setFeeRate(6.5)
                .setFeeType("regular")
                .setAdjValue(0.0)
                .build();
        System.out.println(fee.toString());

    }
}
