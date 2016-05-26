package Models;


import LogFile.LogFile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;


@Entity
public class Solicitations {

    @Id
    @GeneratedValue
    private Long id;

    @Required
    @NotNull
    private String name;

    @Required
    @NotNull
    private String startingAddress;

    @Required
    @NotNull
    private String hour;

    @Required
    @NotNull
    private String numberPhone;

    @Required
    @Email
    @NotNull
    private String email;

    @Required
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

    public Long getId() {
        return id;
    }

}
