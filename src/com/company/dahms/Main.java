package com.company.dahms;

public class Main {

    public static void main(String[] args) {
	helloWorld();
	helloName("Ren");
	helloName("Ren","Stimpy");

	addingnumbers();
	addingnumbers(45,13);
	System.out.println(addingnumbers(1.5,2.5,3.5));
    }


    static void helloWorld(){
        System.out.println("Hello World");
    }

    static void helloName(String name){
        System.out.println("Hello " + name + " welcome to methods!");
    }

    static void helloName(String name, String secondname){
        System.out.println("Hello " + name + " and " + secondname);
    }

    static void addingnumbers(){
        int a= 10;
        int b = 25;
        System.out.println(a+b);
    }

    static void addingnumbers(int a, int b){
        System.out.println(a+b);
    }

    static double addingnumbers(double a, double b, double c){
        double d= a+b+c;
        return d;
    }
}