package controllers.Models;

/**
 * Created by carlos on 27/03/16.
 */
public class User {

    private String registration;

    private String email,password, district, name, destinationAddress, departureTime, returnTime;

    private int houseNumber;

    private boolean isDriver;

    private boolean isFirstLogin;

    public User() {}

    public User(String name, String registration, String email, String password, boolean isDriver, String district, int houseNumber) throws Exception
    {
        this.registration = registration;
        setEmail(email);
        setPassword(password);
        setDestinationAddress(district);
        setHouseNumber(houseNumber);
        setName(name);
        this.isDriver = isDriver;
        isFirstLogin = true;
    }

    public boolean getIsFirstLogin()
    {
        return isFirstLogin;
    }

    public void setIsFirstLogin(boolean isFirstLogin)
    {
        this.isFirstLogin = isFirstLogin;
    }

    public String getName(){ return name;}

    public boolean getIsDriver()
    {
        return isDriver;
    }

    public void setHouseNumber(int number)
    {
        houseNumber = number;
    }

    public int getHouseNumber()
    {
        return houseNumber;
    }

    public void setDestinationAddress(String destinationAddress) throws Exception
    {
        if(destinationAddress == null || destinationAddress.trim().equals(""))
        {
            throw new Exception("Destination Address invalid");
        }

        this.destinationAddress = destinationAddress;
    }

    public String getDestinationAddress()
    {
        return destinationAddress;
    }

    public void setName(String name) throws Exception{
        if(name == null || name.trim().equals(""))
        {
            throw new Exception("Name invalid");
        }
        this.name = name;
    }

    public String getRegistration()
    {
        return registration;
    }

    public String getEmail()
    {
        return email;
    }

    public String getDistrict()
    {
        return district;
    }

    public String getPassword(){
        return password;
    }

    public void setEmail(String email) throws Exception
    {
        if(email == null || email.trim().equals(""))
        {
            throw new Exception("Invalid email");

        }

        this.email = email;
    }

    public void setPassword(String password) throws Exception
    {
        if(password == null || password.trim().equals(""))
        {
            throw  new Exception("Invalid Password");
        }

        this.password = password;
    }

    private void setRegistration(String registration) throws Exception
    {
        if(registration == null || registration.trim().equals(""))
        {
            throw new Exception("Invalid registration");
        }

        this.registration = registration;
    }


    private void setDistrict(String district) throws Exception
    {

        if(district == null || district.trim().equals(""))
        {
            throw new Exception("Invalid Adress.");
        }

        this.district = district;
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        else if(o == null)
        {
            return false;
        }
        else if(getClass() != o.getClass())
        {
            return false;
        }

        User u = (User)o;

        if(email == null && u.getEmail() != null)
        {
            return false;
        }

        return email.equals(u.getEmail());
    }


}
