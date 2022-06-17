package task2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ilya");
        students.add("Maria");
        students.add("Ilya");
        students.add("Roman");
        students.add("Aleksey");
        students.add("Valentin");
        students.add("Vladislav");
        students.add("Yulia");
        students.add("Sergey");
        students.add("Vladislav");
        students.add("Anastasia");
        System.out.println(students.stream().filter(s -> s.equalsIgnoreCase("Anastasia")).count());
        System.out.println(students.stream().map(s -> s.toLowerCase()).filter(s -> s.startsWith("a")).toList());
        if (!students.isEmpty()) {
            System.out.println(students.stream().sorted().findFirst().get());
        } else {
            System.out.println("Empty");
        }
    }
}
