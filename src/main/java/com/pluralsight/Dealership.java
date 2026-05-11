package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
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

    public ArrayList<Vehicle> getVehicleByPrice(double min, double max){
        ArrayList<Vehicle> results = new ArrayList<>();
        return results;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> results = new ArrayList<>();
        return results;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear){
        ArrayList<Vehicle> results = new ArrayList<>();
        return results;
    }

    public ArrayList<Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> results = new ArrayList<>();
        return results;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage){
        ArrayList<Vehicle> results = new ArrayList<>();
        return results;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type){
        ArrayList<Vehicle> results = new ArrayList<>();
        return results;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        ArrayList<Vehicle> results = new ArrayList<>();
        return results;
    }

    public void addVehicle(){

    }

    public void removeVehicle(){

    }
}
