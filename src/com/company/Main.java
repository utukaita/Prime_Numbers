package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        ArrayList<Integer> prime_numbers = new ArrayList<Integer>();
        prime_numbers.add(2);
        for (int starter = 3; starter <= max; starter += 2) {
            boolean adding = true;
            for(int i = 0; i < prime_numbers.size() && prime_numbers.get(i) <= Math.sqrt(starter); i++) {
                if(starter % prime_numbers.get(i) == 0) {
                    adding = false;
                    break;
                }
            }
            if (adding)
                prime_numbers.add(starter);
        }
        for (int i : prime_numbers)
            System.out.println(i);
    }
}