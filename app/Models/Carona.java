package controllers.Models;

import Models.Solicitations;

import java.util.ArrayList;

public class Carona{

    private String startingDistrict, startingRoad, arrivalDistrict, arrivalRoad, startingTime;

    private int numberOfVacancies;

    private ArrayList<Solicitations> solicitations;


    public Carona(String startingDistrict, String startingRoad, String arrivalDistrict, String arrivalRoad, String startingTime, int numberOfVacancies){
        this.startingDistrict = startingDistrict;
        this.startingRoad = startingRoad;
        this.arrivalDistrict = arrivalDistrict;
        this.arrivalRoad = arrivalRoad;
        this.numberOfVacancies = numberOfVacancies;
        solicitations = new ArrayList<Solicitations>();

    }

    public String getStartingDistrict() {
        return startingDistrict;
    }

    public void setStartingDistrict(String startingDistrict) {
        this.startingDistrict = startingDistrict;
    }

    public String getStartingRoad() {
        return startingRoad;
    }

    public void setStartingRoad(String startingRoad) {
        this.startingRoad = startingRoad;
    }

    public String getArrivalDistrict() {
        return arrivalDistrict;
    }

    public void setArrivalDistrict(String arrivalDistrict) {
        this.arrivalDistrict = arrivalDistrict;
    }

    public String getArrivalRoad() {
        return arrivalRoad;
    }

    public void setArrivalRoad(String arrivalRoad) {
        this.arrivalRoad = arrivalRoad;
    }

    public int getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public void setNumberOfVacancies(int numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public ArrayList<Solicitations> getSolicitations() {
        return solicitations;
    }

    public void addSolicitation(Solicitations solicitation){
        solicitations.add(solicitation);
    }
}