package com.example.control_de_asistencia;

public class model_user {
    private int id;
    private String user;
    private String email;
    private String pass;

    public model_user(int id, String user, String email, String pass) {
        this.id = id;
        this.user = user;
        this.email = email;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
