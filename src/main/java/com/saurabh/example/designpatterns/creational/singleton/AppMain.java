package com.saurabh.example.designpatterns.creational.singleton;

public class AppMain {
    public static void main(String[] args) {
        SingletonDesign instance=SingletonDesign.getInstance();

        System.out.println(" instance "+instance.hashCode());
        SingletonDesign instance2=SingletonDesign.getInstance();
        SingletonDesign instance3=SingletonDesign.getInstance();
        SingletonDesign instance4=SingletonDesign.getInstance();
        SingletonDesign instance5=SingletonDesign.getInstance();

        System.out.println(" instance 2 -> "+instance2.hashCode());
        System.out.println(" instance 3 -> "+instance3.hashCode());
        System.out.println(" instance 4 -> "+instance4.hashCode());
        System.out.println(" instance 5 -> "+instance5.hashCode());

        try {
            SingletonDesign instance6=instance.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
