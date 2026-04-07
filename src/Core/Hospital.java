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
public class Hospital {
    
    
    
    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;
    
    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }

    public void addTeam(int teamid, int consultantdoctorid) {
        Team team = new Team(teamid);
        ConsultantDoctor consultantdoctor = new ConsultantDoctor(teamid + consultantdoctorid);
        teams.add(team);
    }

    public void addWard(int i) {
      Ward ward = new Ward(i);
      wards.add(ward);
    }
    public Ward getWard(int index){
        return wards.get(index);
    }
     public Patient getPatient(int index){
         Patient patient = new Patient(index);
         return patient;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void assignPatientDoctor(Patient patient, int doctorid) {
        int teamId = doctorid + this.getTeams().getPatients();
        Doctor doctor = new Doctor(this.patient.getDoctor(doctorid));
        Patient patient = new patient(doct);
        patient.add(doctor);
        doctor.add(patient);
       
    
    }

    public void assignAppoiment(Ward patient, int i) {

    }
   
    public void addJuniorDoctor(Team team,int id){
        JuniorDoctor juniorDoctor = new JuniorDoctor(id,team); 
    }

    public Team getTeam(int index) {
        return this.teams.get(index);
    
    }

    public void addPatient(Ward ward, Team team, int id) {
     Patient patient = new Patient(ward, team, id);
    }
    
    
}
