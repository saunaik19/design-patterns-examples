package com.saurabh.example.designpatterns.creational.prototype;

public class AppMain {
    public static void main(String[] args) throws CloneNotSupportedException {
    PrototypeCapable movie=PrototypeFactory.getInsanceOfEntertainment("movie");
        PrototypeCapable show=PrototypeFactory.getInsanceOfEntertainment("show");
        PrototypeCapable album=PrototypeFactory.getInsanceOfEntertainment("album");
        PrototypeCapable Concert=PrototypeFactory.getInsanceOfEntertainment("concert");


        PrototypeCapable movie2=PrototypeFactory.getInsanceOfEntertainment("movie");
        PrototypeCapable movie3=PrototypeFactory.getInsanceOfEntertainment("movie");
        PrototypeCapable concert2=PrototypeFactory.getInsanceOfEntertainment("concert");
        PrototypeCapable concert3=PrototypeFactory.getInsanceOfEntertainment("concert");
        System.out.println("concert 1"+Concert.hashCode());
        System.out.println("concert 2"+concert2.hashCode());
        System.out.println("concert 3"+concert3.hashCode());


    }
}
