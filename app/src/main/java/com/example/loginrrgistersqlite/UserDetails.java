package com.example.loginrrgistersqlite;
public class UserDetails
{
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String  ID  ;
    public String  Username ;
    public String FirstName ;
    public String LastName ;
    public String Address ;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String Country ;
    public String Email ;
    public String Password ;
    public String Mobile ;
    public UserDetails() { }

    public UserDetails(String ID, String username, String firstName, String lastName, String address, String country, String email, String password, String mobile) {
        this.ID = ID;
        Username = username;
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        Country = country;
        Email = email;
        Password = password;
        Mobile = mobile;
    }

    public UserDetails(String Password) //Constructor with one parameter
    {
        this.Password = Password;
    }

}