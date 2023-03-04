package org.example;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        if (login.equals(email)) {
            throw new IllegalArgumentException();
        } else if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException();
        }
        this.login = login;
    }


    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

}

