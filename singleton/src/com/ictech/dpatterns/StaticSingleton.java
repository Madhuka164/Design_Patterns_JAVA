package com.ictech.dpatterns;

public class StaticSingleton {
    //create private instance
    private static StaticSingleton ss;


    //make constructor private


    private StaticSingleton() {
    }

    //making static block with exception handling
    static {
        try{
            ss=new StaticSingleton();
        }
        catch(Exception e){
            throw new RuntimeException("show error");
        }
    }

    //return only object available
     public static StaticSingleton getInstance(){
        return ss;
     }
}


