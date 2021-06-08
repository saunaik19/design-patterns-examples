package com.saurabh.example.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String,PrototypeCapable> entertainment=new HashMap<>();
    static {
        entertainment.put("movie",new Movie());
        entertainment.put("show",new Show());
        entertainment.put("concert",new Concert());
        entertainment.put("album",new Album());
    }
    public static PrototypeCapable getInsanceOfEntertainment(String type) throws CloneNotSupportedException {
        return entertainment.get(type).clone();
    }
}
