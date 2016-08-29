package com.programacion.movil.estemanp.androidmvcapplication.Controller;

import com.programacion.movil.estemanp.androidmvcapplication.Domain.User;

import java.util.List;

/**
 * Created by lds on 22/08/2016.
 */
public class SingletonController {
    private List<User> users;
    private static SingletonController _instance;
    public static SingletonController get_instance()
    {
        if (_instance == null) {
            _instance = new SingletonController();
        }
        return _instance;
    }
    private void fillDateBases(){
        //Add users
        fillUsers();
    }

    private void fillUsers(){
        User person1=new User("Andres","Perez","estemanp","1234",24);
        users.add(person1);

        User person2=new User("Jessica","Ramirez","jessica","1234",16);
        users.add(person2);
    }

    public boolean isValidUser(String username, String password){
        Boolean resp=false;
        for (User person:users) {
            if(username.equals(person.getUserName())){
                if(password.equals(person.getPassword())){
                    resp=true;
                }
            }
        }
        return resp;
    }
}
