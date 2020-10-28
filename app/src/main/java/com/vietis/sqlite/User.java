package com.vietis.sqlite;

public class User {
    private int resource;
    private String userName;
    private String content;
    private String date;
    private int star;

    public User(String userName, String content, String date) {
        this.resource = R.drawable.ic_account;
        this.userName = userName;
        this.content = content;
        this.date = date;
        this.star = R.drawable.ic_star_gray;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }
}
