package DBManager;

import controllers.Models.User;
import controllers.Models.Driver;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<User> db;

    public DBManager() throws Exception {
        db = new ArrayList<User>();
        populateArray();
    }

    private void populateArray()
    {
        Driver u1 = null;
        Driver u2 = null;

        try {
            u1 = new Driver("113110864","carlos.interaminense@ccc.ufcg.edu.br", "123456");
            u2 = new Driver("113111426","izabella.queiroz@ccc.ufcg.edu.br", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.add(u1);
        db.add(u2);
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
