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

    public Patient(int id) {
        this.appointments = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }
    public Patient(Ward wards, Team team, int id) {
        this.id = id;
        this.team = team;
        this.wards = wards;
        this.team.addPatients(this);
    }

    public Doctor getDoctors(int index) {
        return doctors.get(index);
    }

    public Team getTeam() {
        return team;
    }

    public int getId() {
        return id;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    void add(Doctor doctor) {
     doctors.add(doctor);
    }
}
