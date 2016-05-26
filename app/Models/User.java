package controllers.Models;

import Models.Solicitations;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ElementCollection;

import play.data.validation.Constraints.Required;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;



/**
 * Created by carlos on 27/03/16.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Required
    @NotNull
    private String registration;

    @Required
    @Email
    @NotNull
    private String email;

    @Required
    @NotNull
    private String password;

    @Required
    @NotNull
    private String district;

    @Required
    @NotNull
    private String road;

    @Required
    @NotNull
    private String name;

    @Required
    @NotNull
    private String departureTime;

    @Required
    @NotNull
    private String returnTime;

    @Required
    @NotNull
    private boolean isDriver;

    @NotNull
    private int numberOfVacancies, numberOfVacanciesFree;

    @ElementCollection
    private ArrayList<Carona> myCaronasCreateds;

    @ElementCollection
    private ArrayList<Carona> avaliableCaronas;

    @ElementCollection
    private ArrayList<Solicitations> solicitationsForCarona;

    @Required
    @NotNull
    private String phoneNumber;


    public User() {}

    public int getNumberOfVacanciesFree() {
        return numberOfVacanciesFree;
    }

    public void setNumberOfVacanciesFree(int numberOfVacanciesFree) {
        this.numberOfVacanciesFree = numberOfVacanciesFree;
    }

    public User(String name, String registration, String email,
                String password, boolean isDriver, String district, String road, String phoneNumber) throws Exception {
        this.registration = registration;
        setEmail(email);
        setPassword(password);
        setDistrict(district);
        setRoad(road);
        setName(name);
        this.phoneNumber = phoneNumber;
        this.isDriver = isDriver;
        myCaronasCreateds = new ArrayList<Carona>();
        solicitationsForCarona = new ArrayList<Solicitations>();
//        solicitationsForCarona.add(new Solicitations("izabella.queiroz@ccc.ufcg.edu.br", "Izabella", "Centenário", "10:00", "9888-8888"));
        avaliableCaronas = new ArrayList<Carona>();
 //       myCaronasCreateds.add(new Carona("teste", "teste 2", "teste 3", "teste 4", "teste 5", 4));
  //      myCaronasCreateds.add(new Carona("teste", "teste 2", "teste 3", "teste 4", "teste 5", 4));
    }

    public User(String name, String registration, String email, String password, boolean isDriver,
                String district, String road, String phoneNumber, int numberOfVacancies) throws Exception{
        this(name, registration, email, password, isDriver, district, road, phoneNumber);
        this.numberOfVacancies = numberOfVacancies;
        numberOfVacanciesFree = numberOfVacancies;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAcceptSolicitationbyIndex(int id, boolean isAcceptSolicitation){
        solicitationsForCarona.get(id).setAcceptSolicitation(isAcceptSolicitation);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Carona> getAvaliableCaronas() {
        return avaliableCaronas;
    }

    public void setAvaliableCaronas(ArrayList<Carona> avaliableCaronas) {
        this.avaliableCaronas = avaliableCaronas;
    }

    public String getRoad() {
        return road;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public void setDriver(boolean driver) {
        isDriver = driver;
    }

    public int getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public void setNumberOfVacancies(int numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }

    public void setRoad(String road) throws Exception
    {
        if(road == null || road.trim().equals(""))
        {
            throw new Exception("Invalid road");
        }

        this.road = road;
    }

    public ArrayList<Carona> getMyCaronasCreateds(){ return myCaronasCreateds;}

    public ArrayList<Solicitations> getSolicitationsForCarona() {
        return solicitationsForCarona;
    }

    public void removeSolicitation(int solicitationId) {
        solicitationsForCarona.remove(solicitationId);
    }

    public void addSolicitation(Solicitations solicitation){
        solicitationsForCarona.add(solicitation);
    }

    public String getName(){ return name;}

    public boolean getIsDriver()
    {
        return isDriver;
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

    public void setRegistration(String registration) throws Exception
    {
        if(registration == null || registration.trim().equals(""))
        {
            throw new Exception("Invalid registration");
        }

        this.registration = registration;
    }

    public void setDistrict(String district) throws Exception
    {

        if(district == null || district.trim().equals(""))
        {
            throw new Exception("Invalid Adress.");
        }

        this.district = district;
    }

    public void addCarona(Carona carona){
        myCaronasCreateds.add(carona);
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

    public Long getId() {
        return id;
    }
}


