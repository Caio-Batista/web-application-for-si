package controllers.Models;

import DBManager.*;

import controllers.Models.*;

public class Validate{

    public Validate(){}

    public static boolean validateLogin(String email, String senha, DBManager dataBaseManager){
        User user = dataBaseManager.searchUserByEmail(email);
        if (user == null) {
            return false;
        }
        if (!user.getPassword().equals(senha)) {
            return false;
        }
        return true;
    }
}