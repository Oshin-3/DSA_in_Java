package com.String;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b); // returns true, both 'a' and 'b' points to same object inside String pool in the heap memory.

        //reinitialize a
        a = "World";
        System.out.println(a == b);// now a points to "World" object present in same String pool inside the heap memory.
        //Hence it will return false

        String c = new String("Great");
        String d = new String("Great");
        System.out.println(c == d);
        //It will return false because now 'c' and 'd' refers to 2 different objects in the heap memory.

        System.out.println(c.equals(d));
        //It will return true because value of the object is same i.e. "Great".

        String e = "Three";
        String f = "Three";
        String g = "Three";
        System.out.println(e + " " + f + " " + g);
        //It will return "Three Three Three"
        //and all the reference i.e. 'e', 'f', 'g' is referring to same object i.e. "Three" in the String pool inside
        //heap memory

        // Now I want to change value of 'e' reference to "Math"
        e = "Math";
        //It will print "Math Three Three"
        System.out.println(e + " " + f + " " + g);


    }
}
