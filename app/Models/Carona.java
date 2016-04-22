package controllers.Models;

import Models.Solicitations;

import java.util.ArrayList;

public class Carona{

    private String startingDistrict, startingRoad, arrivalDistrict, arrivalRoad, startingTime;

    private String email;

    private int numberOfVacancies;

    public Carona(String email, String startingDistrict, String startingRoad, String arrivalDistrict, String arrivalRoad, String startingTime, int numberOfVacancies){
        this.startingDistrict = startingDistrict;
        this.startingRoad = startingRoad;
        this.arrivalDistrict = arrivalDistrict;
        this.arrivalRoad = arrivalRoad;
        this.numberOfVacancies = numberOfVacancies;
        this.email = email;
    }

    public String getEmail(){
        return email;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carona carona = (Carona) o;

        if (startingDistrict != null ? !startingDistrict.equals(carona.startingDistrict) : carona.startingDistrict != null)
            return false;
        if (startingRoad != null ? !startingRoad.equals(carona.startingRoad) : carona.startingRoad != null)
            return false;
        if (arrivalDistrict != null ? !arrivalDistrict.equals(carona.arrivalDistrict) : carona.arrivalDistrict != null)
            return false;
        if (arrivalRoad != null ? !arrivalRoad.equals(carona.arrivalRoad) : carona.arrivalRoad != null) return false;
        if (startingTime != null ? !startingTime.equals(carona.startingTime) : carona.startingTime != null)
            return false;
        return email != null ? email.equals(carona.email) : carona.email == null;

    }

}