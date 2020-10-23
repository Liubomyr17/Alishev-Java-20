package com.company;


public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human();
    }
}

class Human {

    private String name;
    private int age;

    public Human() {
        this.name = "Name by default!";
        this.age = 0;
    }

    public Human(String name) {
        System.out.println("Hey from the second constructor!");
        this.name = name;
    }

    public Human(String name, int age) {
        System.out.println("Hey from the third constructor!");
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int myAge) {
        this.age = myAge;
    }
}