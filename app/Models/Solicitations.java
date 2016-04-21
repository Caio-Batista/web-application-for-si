package Models;

/**
 * Created by Yago on 21/04/2016.
 */
public class Solicitations {

    private String name, startingAddress, hour, numberPhone;

    public Solicitations(String name, String startingAddress, String hour, String numberPhone){
        this.name = name;
        this.startingAddress = startingAddress;
        this.hour = hour;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name == null || name.trim().equals("")){
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
            throw new Exception("Starting adress invalid.");
        }else{
            this.startingAddress = startingAddress;
        }
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) throws Exception {
        if(hour == null || hour.trim().equals("")){
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
            throw new Exception("Phone number invalid.");
        }else {
            this.numberPhone = numberPhone;
        }
    }
}
