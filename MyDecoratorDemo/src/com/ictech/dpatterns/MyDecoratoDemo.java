package com.ictech.dpatterns;

public class MyDecoratoDemo {

        public static void main(String[] args) {
            Computer com=new Computer()  ;
            System.out.println(com.Description());

            com= new ComDVD(com);

            com= new ComMonitor(com);

            System.out.println(com.Description());



    }





}
