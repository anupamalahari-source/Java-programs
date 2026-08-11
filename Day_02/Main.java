package Day_02;

import java.util.Scanner;

class Student {

    String name;
    int age;
    int rollno;
    float marks;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your roll number: ");
        rollno = sc.nextInt();

        System.out.print("Enter your marks: ");
        marks = sc.nextFloat();
    }

    void display() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

        s.input();
        s.display();
    }
}
