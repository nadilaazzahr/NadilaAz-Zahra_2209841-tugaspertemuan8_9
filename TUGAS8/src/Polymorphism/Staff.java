/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author Asus VivobookPro14
 */
public class Staff extends Employee {
    private String title;

    public Staff() {
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Kelas: Staff\nNama: " + name + "\nAlamat: " + address + "\nNoTelpon: " + phoneNumber + "\nEmail: " + email+ "\nKantor: " + office + "\nGaji: " + salary + "\nGelar: " + title;
    }
}