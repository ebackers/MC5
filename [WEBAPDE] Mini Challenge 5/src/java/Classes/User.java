/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

import java.util.ArrayList;

/**
 *
 * @author Arces
 */
public class User {
    private String username;
    private int userID;
    private ArrayList<Photo> userPhotos;
    
    public User(int userID, String username){
        this.userID = userID;
        this.username = username;
        userPhotos = new ArrayList<>();
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public ArrayList<Photo> getUserPhotos() {
        return userPhotos;
    }

    public void setUserPhotos(ArrayList<Photo> userPhotos) {
        this.userPhotos = userPhotos;
    }
}
