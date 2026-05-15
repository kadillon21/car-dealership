package com.pluralsight;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public ArrayList<Vehicle> getVehicleByPrice(double minPrice, double maxPrice){
        return inventory
                .stream()
                .filter(vehicle -> vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return inventory
                .stream()
                .filter(vehicle -> vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear){
        return inventory
                .stream()
                .filter(vehicle -> vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehicleByColor(String color){
        return inventory
                .stream()
                .filter(vehicle -> vehicle.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage){
        return inventory
                .stream()
                .filter(vehicle -> vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getVehiclesByType(String type){
        return inventory
                .stream()
                .filter(vehicle -> vehicle.getVehicleType().equalsIgnoreCase(type))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){

        inventory.remove(vehicle);
    }
}
