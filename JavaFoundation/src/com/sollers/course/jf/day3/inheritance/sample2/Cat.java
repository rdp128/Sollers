package com.sollers.course.jf.day3.inheritance.sample2;


public class Cat extends Animal{
        String name;
    public Cat(){
        System.out.println("\nCAT");
    }
    
    public void setName( String nm){
        name = nm;
    }
    
    public String getName(){
        System.out.println("Name : " +name);
        return name;
    }
    
    public void play(){
        System.out.println("Cat can play");
    }
    
}
