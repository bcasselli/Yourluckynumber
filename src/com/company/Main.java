package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner ranName = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = ranName.nextLine();
        System.out.println("How old are you? ");
        double age = ranName.nextDouble();

        randomNum perf = new randomNum;
        System.out.println("Nice to meet you "+ " "+ name +" "+ "Your lucky number is" + " " + perf.perfectNum());
    }
}
