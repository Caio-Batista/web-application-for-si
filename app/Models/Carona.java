package controllers.Models;

public class Carona{

    private String startingAddress;

    private String arrivalAddress;

    public Carona(String startingAddress, String arrivalAddress){
        this.arrivalAddress = arrivalAddress;
        this.startingAddress = startingAddress;
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
}