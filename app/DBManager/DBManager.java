package DBManager;

import controllers.Models.User;
import controllers.Models.Carona;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<User> db;

    private static DBManager database = new DBManager();

    private DBManager(){
        db = new ArrayList<User>();
        try{
            populateArray();
        }catch (Exception e){}
    }

    public static DBManager getInstance(){
        return database;
    }

    private void populateArray()
    {
        User u1 = null;
        User u2 = null;
        Carona c1 = null;

        try {
            u1 = new User("Carlos", "113110864","carlos.interaminense@ccc.ufcg.edu.br", "123456", true, "Aqui", "rua2","9988-8888",4);
            u2 = new User("Izabella", "113111426","izabella.queiroz@ccc.ufcg.edu.br", "123456", false, "Aqui", "rua2", "8999-8998");

        } catch (Exception e) {
            e.printStackTrace();
        }
        db.add(u1);
        db.add(u2);

    }

   private int returnIndexUser(String email) //aqui
    {
        for(int i =0; i <db.size(); ++i)
        {
            if(db.get(i).getEmail().equals(email))
            {
                return i;
            }
        }

        return -1;
    }

    public void updateUser(User user) //aqui
    {
        User u = searchUserByEmail(user.getEmail());

        db.remove(u);
        db.add(user);
    }

    public User searchUserByRegistration(String registration)
    {
        for(int i =0; i <db.size(); ++i)
        {
            if(db.get(i).getEmail().equals(registration))
            {
                return db.get(i);
            }
        }

        return null;
    }

    public User searchUserByEmail(String email)
    {
        for(int i =0; i <db.size(); ++i)
        {
            if(db.get(i).getEmail().equals(email))
            {
                return db.get(i);
            }
        }

        return null;
    }

    public boolean userExistInDataBase(User user)
    {

        return db.contains(user);
    }

    public boolean writeInDataBase(User user)
    {
        if(userExistInDataBase(user))
        {
            return false;
        }
        db.add(user);

        return true;
    }

    public ArrayList<Carona> driversPassingByUserStart(User user){
        ArrayList<Carona> ar = new ArrayList<Carona>();
        for (User element : db) {

            if (element.isDriver() && element.getMyCaronasCreateds() != null){

                for (Carona car : element.getMyCaronasCreateds()){
                    if (car.getStartingDistrict().equals(user.getDistrict())){
                        ar.add(car);
                    }
                }
            }
        }

        return ar;
    }

    public ArrayList<Carona> driversPassingByUserArrival(User user){
        ArrayList<Carona> ar = new ArrayList<Carona>();
        for (User element : db) {

            if (element.isDriver() && element.getMyCaronasCreateds() != null){

                for (Carona car: element.getMyCaronasCreateds())
                    if (car.getArrivalDistrict().equals(user.getDistrict())){
                        ar.add(car);
                }
            }
        }

        return ar;

    }

    public String returnDB(){
        return db.toString();
    }


}
