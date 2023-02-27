package com.example;

public class Participant {
    public static String COMPANY_NAME="ALBILAD";
    public String trainerName;
    public int id;
    public String name;

    public Participant(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void doListen(){
        System.out.println(this.name+" Listening");
    }
    public String toString(){
        return "id="+this.id+",name="+this.name;
    }
}
