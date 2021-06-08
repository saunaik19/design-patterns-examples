package com.saurabh.example.designpatterns.creational.singleton;

import java.io.Serializable;
import java.util.Objects;

public class SingletonDesign implements Cloneable, Serializable {

    private static volatile SingletonDesign instance=null;

    private SingletonDesign(){
        if(Objects.nonNull(instance))
        throw new RuntimeException("Operation not supported, user getInstance method...");
    }

    public static SingletonDesign getInstance(){
        if(Objects.isNull(instance)){
            synchronized (SingletonDesign.class){
                if(Objects.isNull(instance)){
                    return instance=new SingletonDesign();
                }
            }
        }
    return instance;
    }

    @Override
    public SingletonDesign clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve(){
        return instance;
    }

}
