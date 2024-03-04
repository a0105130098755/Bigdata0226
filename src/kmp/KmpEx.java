package kmp;

import java.util.Scanner;

import java.util.Scanner;

public class KmpEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lForm = scanner.nextLine();

        String sForm = lForm.replaceAll("[^A-Z]", "");

        System.out.println(sForm);
    }
}



