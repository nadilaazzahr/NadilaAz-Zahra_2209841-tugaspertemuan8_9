/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Asus VivobookPro14
 */
public class Employee extends Person {
    String office;
    double salary;
    MyDate dateHired;

    public Employee() {
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Kelas: Empolyee\nNama: " + name + "\nAlamat: " + address + "\nNoTelpon: " + phoneNumber + "\nEmail: " + email + "\nKantor: " + office + "\nGaji: " + salary + "\nTanggal mulai kerja: " + dateHired;
    }
}