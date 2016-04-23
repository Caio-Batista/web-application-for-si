package Models;


import LogFile.LogFile;

public class Solicitations {

    private String name, startingAddress, hour, numberPhone, email;

    private boolean isAcceptSolicitation;

    public Solicitations(String email, String name, String startingAddress, String hour, String numberPhone){
        this.email = email;
        this.name = name;
        this.startingAddress = startingAddress;
        this.hour = hour;
        this.numberPhone = numberPhone;
    }

    public boolean isAcceptSolicitation() {
        return isAcceptSolicitation;
    }

    public void setAcceptSolicitation(boolean acceptSolicitation) {
        isAcceptSolicitation = acceptSolicitation;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name == null || name.trim().equals("")){
            LogFile.writeInLog("An user try choose Name, but is name invalid.");
            throw new Exception("Name invalid.");
        }else {
            this.name = name;
        }
    }

    public String getStartingAddress() {
        return startingAddress;
    }

    public void setStartingAddress(String startingAddress) throws Exception {
        if(startingAddress == null || startingAddress.trim().equals("")){
            LogFile.writeInLog("An user try choose starting addres, but starting address is invalid.");
            throw new Exception("Starting address invalid.");
        }else{
            this.startingAddress = startingAddress;
        }
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) throws Exception {
        if(hour == null || hour.trim().equals("")){
            LogFile.writeInLog("An user try choose hour, but is hour invalid.");
            throw new Exception("Hour invalid.");
        }else {
            this.hour = hour;
        }
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) throws Exception {
        if(numberPhone == null || numberPhone.trim().equals("")){
            LogFile.writeInLog("An user try choose phone number, but is phone number invalid.");
            throw new Exception("Phone number invalid.");
        }else {
            this.numberPhone = numberPhone;
        }
    }
}
