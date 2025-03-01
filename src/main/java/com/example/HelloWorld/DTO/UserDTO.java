package com.example.HelloWorld.DTO;

public class UserDTO {
     private String firstName;
     private String  lastName;

    public  UserDTO(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public  String getfirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public  String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
}
