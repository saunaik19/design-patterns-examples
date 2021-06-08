package com.saurabh.example.designpatterns.creational.prototype;

public interface PrototypeCapable extends Cloneable{
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
