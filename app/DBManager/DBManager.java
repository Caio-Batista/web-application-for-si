package DBManager;

import controllers.Models.User;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<User> db;

    public DBManager() throws Exception {
        db = new ArrayList<User>();
        populateArray();
    }

    private void populateArray()
    {
        User u1 = null;
        User u2 = null;

        try {
            u1 = new User("Carlos", "113110864","carlos.interaminense@ccc.ufcg.edu.br", "123456", true, "Ali", 321);
            u2 = new User("Izabella", "113111426","izabella.queiroz@ccc.ufcg.edu.br", "123456", false, "Aqui", 123);
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.add(u1);
        db.add(u2);
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

}
