/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author Manuel Ojeda
 */
public abstract class Doctor {
    protected int ID;
    protected Team team;
    protected ArrayList<Appointment> appointmens;
    protected ArrayList<Patient> patients;

    public Doctor(int ID, Team team, ArrayList<Appointment> appointmens, ArrayList<Patient> patients) {
        this.ID = ID;
        this.team = team;
        this.appointmens = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    
}
