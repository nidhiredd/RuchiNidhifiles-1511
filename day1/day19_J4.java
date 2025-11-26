//type of variables in code: 
import java.util.*;
class demo{
    //static int a = 10;
    int a =10;
}
class hello{
    public static void main(string args[]){
        Scanner sc = new Scanner(System.in);
        demo d = new demo();
        //system .out.println(demo.a);
        system.out.println(d.a);
    }
}


//variables and constructers and superkey 
class A {
    static int  a = 10;
    A(){
    System.out.println("hello I am a constructer");
    }
    A(int  a){
        this.a = a;
    }
    static void show(){
        System.out.println(a);
    }
}
class hello extends A{
    hello(O){
        super();
    }
    public hello (int x){
        super(x);
    }}


//day20_J5.java
// difference between instance variable  code 
class A {
    static int  a = 10;
      A(int  a){
        this.a = a;
    }
    void show(){
        System.out.println(a);
    }
    class hello extends A{
    hello(O){
        super();
    }
     public static void main(String args[]){
        hello hello1 = new hello(101);
        hello hello2 = new hello(102);
        hello1.show();
        hello2.show();
     }
    }
}


//even if i give static variable it should be updated(constructer ,method  and variables)
class A {
    static int  a = 10;
      A(int  a){
        this.a = a;
    }
    void show(){
        System.out.println(a);
    }
    class hello extends A{
    hello(O){
        super();
    }
     
}



//inheritance properties and type of inheritance code 



//Oops concepts in java 
//method overriding and method overloading code
class Calculator {
    int add(int a, int b) {  // 2 numbers
        return a + b;
    }

    int add(int a, int b, int c) {  // 3 numbers
        return a + b + c;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));      // prints 15
        System.out.println(c.add(5, 10, 15));  // prints 30
    }
}


// method overloading .. code
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {   // overriding
        System.out.println("Dog barks");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();   // prints: Dog barks
    }
}


//day21_J6.java
//upcasting and downcasting
class A{
    int m=0;
    void shopw(){
        System.out.println("class A");
    }
}
class hello extendsA{
    int m=0;
    void show(){
        System.out.println("class hello");
    }
    void show2(){
        System.out.println("second method");
    }
     public static void main(String[] args){
        hello h = new hello();//upcasting
         A a = new A();
         A a = new hello();
         hello h = (hello)a;
         a.show();
         h.show2();
         System.out.println(h.m);
     }
}
//hyerarical inheritance
class A{
    void show(){

        system.out.println("class A");
    }
}
class B extends A{
    void show(){
        System.out.println("class B");
    }
}
class C extends A{
    void show(){
        System.out.println("class C");
    }
}class D extends A{
    void show(){
        System.out.println("class D");
    }
}class E extends A{
    void show(){
        System.out.println("class E");
    }
}
class hello{
    public static void set(A obj){
     obj.show();
    }
    public static void main(string[] args){
        A obj;
        obj = new C();
        obj.show();
         obj = new B();
         obj.show();
         set(new A());
         set(new B());
         set(new C());
         set(new D());
         set(new E());
    }
}



//encapsulation using private method 
class A{
    private int n = 5;
    private int n1 = 13;
    int get(){
       return n;
       System.out.println(n+" "+n1)
    }
    void set(int n){
        this.n=n;
        this.n1=n1;
    }
}
class hello{
    public static void main(String[] args){
        A a = new A();
        a.get();
        a.set(20,2876);
        a.get();
        system.out.println(a.get());
    }
}



//Abstraction 
abstract class A{
    public abstract void show();
    void display(){
        System.ou.println("class A");
    }
}
class hello extends A{
    public void show(){
        System.ou.println("hello class ");
    }
    public static void main(String[] args){
        hello h = new hello();
        h.show();
        // System.ou.println(" ");
    }
}



//day22_J7.java
//import java.util.*;
// class hello {
//     public static void main(String[] args) {
        // try{
        //     System.out.println("hello all");
        //     System.out.println("good morning");
        //     int a=10/0;
        //     String s=null;
        //     int len=s.length();
        //     System.out.println(len);
        //     String s1="123";
        //     int a=Integer.parseInt(s1);
        //     int arr[]=new int[5];
        //     System.out.println(arr[10]);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        // try{
        //     System.out.println("good morning");
        //     int arr[]=new int[5];
        //     try{
        //         int a=10/0;
        //         System.out.println(a);
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }
        // }finally{
        //         System.out.println("hiiiiiiii");
        //     }
        //     System.out.println("hello all");
//     }
// }

import java.util.Scanner;

class hello{
    public void valid(int a)throws Exception {
        if(a<17){
            throw new Exception("not eligible");
        } else {
            System.out.println("eligible");
        }
    }
    void show(int a){
        try{
            valid(a);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        hello h=new hello();
        int a=sc.nextInt();
        h.show(a);
    }
}

//autoboxing,boxing,unboxing(like changing primi†ve types for integer, float,and other). (wraper classes)
import java.util.*;



