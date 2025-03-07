package edu.school.project;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10);
        System.out.println(number);
    }
}