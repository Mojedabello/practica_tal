/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author luddy
 */
public class Patient {
    private int id;
    private Team team;
    private Ward wards;
    private ArrayList<Appointment> appointments;
    private ArrayList<Doctor> doctors;

    public Patient() {
        this.appointments = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }
    
}
