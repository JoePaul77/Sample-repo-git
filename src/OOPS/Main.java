package OOPS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            students[i] = new Student(name);
        }

        for (Student s : students) {
            System.out.println(s); // calls toString() automatically
        }
    }
}