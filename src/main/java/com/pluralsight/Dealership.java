package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<String> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone, ArrayList<String> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<String> getVehicleByPrice(int min, int max){
        ArrayList<String> results = new ArrayList<>();
        return results;
    }

    public ArrayList<String> getVehiclesByMakeModel(){
        ArrayList<String> results = new ArrayList<>();
        return results;
    }

    public ArrayList<String> getVehiclesByYear(){
        ArrayList<String> results = new ArrayList<>();
        return results;
    }

    public ArrayList<String> getVehicleByColor(int min, int max){
        ArrayList<String> results = new ArrayList<>();
        return results;
    }

    public ArrayList<String> getVehiclesByMileage(){
        ArrayList<String> results = new ArrayList<>();
        return results;
    }

    public ArrayList<String> getVehiclesByType(){
        ArrayList<String> results = new ArrayList<>();
        return results;
    }

    public ArrayList<String> getAllVehicles(int min, int max){
        ArrayList<String> results = new ArrayList<>();
        return results;
    }

    public void addVehicle(){

    }

    public void removeVehicle(){

    }
}
