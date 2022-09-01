package com.mahesh_prajapati.kotlin_examples.function.interoperability;

public class MyJavaClass {
    public static void main(String[] args){
        // calling kotlin class function
      // MyKotlinClassKt.addition(5,4);
        MyCustomfileName.addition(5,4);

    }
    public static void addition(int a, int b){
        System.out.println("Java addition result is"+(a+b));
    }
}
