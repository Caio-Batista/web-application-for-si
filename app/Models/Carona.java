package controllers.Models;

import Models.Solicitations;

import java.util.ArrayList;

public class Carona{

    private String startingAddress, arrivalAddress;

    private int numberOfVacancies;

    private ArrayList<Solicitations> solicitations;

    public Carona(String startingAddress, String arrivalAddress, int numberOfVacancies){
        this.arrivalAddress = arrivalAddress;
        this.startingAddress = startingAddress;
        this.numberOfVacancies = numberOfVacancies;
        solicitations = new ArrayList<Solicitations>();

    }

    public String getStartingAddress() {
        return startingAddress;
    }

    public void setStartingAddress(String startingAddress) throws Exception {
        if(startingAddress == null || startingAddress.trim().equals(""))
        {
            throw new Exception("Starting adress invalid.");
        }

        this.startingAddress = startingAddress;
    }

    public String getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(String arrivalAddress) throws Exception {
        if(arrivalAddress == null || arrivalAddress.trim().equals("")){
         throw new Exception("Arrival address invalid");
        }

        this.arrivalAddress = arrivalAddress;
    }

    public int getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public void setNumberOfVacancies(int numberOfVacancies) throws Exception {
        if(numberOfVacancies < 0){
            throw new Exception("Arrival address invalid");
        }
        this.numberOfVacancies = numberOfVacancies;
    }

    public ArrayList<Solicitations> getSolicitations() {
        return solicitations;
    }

    public void addSolicitation(Solicitations solicitation){
        solicitations.add(solicitation);
    }
}