package com.ontology.app.bo;

public class UserBO {
      Long id;
      String email;
      String password;
      String username;

      String role;


    public String getRole () {
        return role;
    }

    public void setRole (String role) {
        this.role = role;
    }

    private Boolean isPremium;

    public Boolean getPremium () {
        return isPremium;
    }

    public void setPremium (Boolean premium) {
        isPremium = premium;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }
}
