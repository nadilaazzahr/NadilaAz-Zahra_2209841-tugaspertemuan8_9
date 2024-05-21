/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Asus VivobookPro14
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St", "555-5555", "johndoe@example.com");
        Student student = new Student("Jane Doe", "456 Main St", "555-5556", "janedoe@example.com", Student.SENIOR);
        Employee employee = new Employee("Jim Beam", "789 Main St", "555-5557", "jimbeam@example.com", "Office 101", 50000, new MyDate());
        Faculty faculty = new Faculty("Dr. Smith", "101 College St", "555-5558", "drsmith@example.com", "Office 202", 75000, new MyDate(), 10, "Professor");
        Staff staff = new Staff("Anna Lee", "202 College St", "555-5559", "annalee@example.com", "Office 303", 40000, new MyDate(), "Administrator");

        System.out.println(person.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(student.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(employee.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(faculty.toString());
        System.out.println("=========================================");
        System.out.println();
        System.out.println(staff.toString());
        System.out.println("=========================================");
        System.out.println();
    }
}

