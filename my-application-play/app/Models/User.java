package controllers.Models;

/**
 * Created by carlos on 27/03/16.
 */
public class User {

    private String registration;

    private String email;

    private String password;

    private String adress;

    public User()
    {

    }

    public User(String registration, String email, String password) throws Exception
    {
        this.registration = registration;
        setEmail(email);
        setPassword(password);
    }

    public String getRegistration()
    {
        return registration;
    }

    public String getEmail()
    {
        return email;
    }

    public String getAdress()
    {
        return adress;
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

    public void setRegistration(String registration) throws Exception
    {
        if(registration == null || registration.trim().equals(""))
        {
            throw new Exception("Invalid registration");
        }

        this.registration = registration;
    }


    public void setAdress(String adress) throws Exception
    {

        if(adress == null || adress.trim().equals(""))
        {
            throw new Exception("Invalid Adress.");
        }

        this.adress = adress;
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
