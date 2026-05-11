package com.pluralsight;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserInterface {

    private Dealership dealership;

    public void display() throws FileNotFoundException {
        boolean programRunning = true;
        init();

        while (programRunning) {
            System.out.println("\nDealership Search Engine");
            System.out.println("1) Find by price range");
            System.out.println("2) Find by make / model");
            System.out.println("3) Find by year range");
            System.out.println("4) Find by color");
            System.out.println("5) Find by mileage range");
            System.out.println("6) Find by vehicle type");
            System.out.println("7) List ALL vehicles");
            System.out.println("8) Add a vehicle");
            System.out.println("9) Remove a vehicle");
            System.out.println("10) Quit \n");

            switch (UserInput.promptForInt("Your choice ", 1, 10)){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByTypeRequest();
                    break;
                case 7:
                    processAllVehiclesRequest();
                case 8:
                    processAddVehicleRequest();
                case 9:
                    processRemoveVehicleRequest();
                case 10:
                    programRunning = false;
            }
        }

    }

    private void init() throws FileNotFoundException {

        DealershipFileManger dealershipFileManger = new DealershipFileManger();

        this.dealership =  DealershipFileManger.getDealership();

    }

    public void displayVehicles(ArrayList<Vehicle> list) {

        System.out.println("\n╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                             Vehicles                                                 ║");
        System.out.println("╠═════════╦════════╦══════════════╦═══════════════════════╦══════════╦═════════╦═══════════╦═══════════╣");
        System.out.println("║   Vin   ║  Year  ║     Make     ║         Model         ║   Type   ║  Color  ║  Mileage  ║   Price   ║");

        for (Vehicle vehicle : list) {
            System.out.printf("║ %7s ║ %6d ║ %12s ║ %21s ║ %8s ║ %7s ║ %9d ║ %9.2f ║\n",
                    vehicle.getVin(),
                    vehicle.getYear(),
                    vehicle.getMake(),
                    vehicle.getModel(),
                    vehicle.getVehicleType(),
                    vehicle.getColor(),
                    vehicle.getOdometer(),
                    vehicle.getPrice());

        }
        System.out.println("╠═════════╩════════╩══════════════╩═══════════════════════╩══════════╩═════════╩═══════════╩═══════════╣");
    }

    public void processGetByPriceRequest(){
        double minPrice = UserInput.promptForInt("Minimum price ", 1);
        double maxPrice = UserInput.promptForInt("Maximum price ", 1);
        displayVehicles(dealership.getVehicleByPrice(minPrice, maxPrice));
    }

    public void processGetByMakeModelRequest(){
        String make = UserInput.promptForString("Make ");
        String model = UserInput.promptForString("Model ");
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

    public void processGetByYearRequest(){
        int minYear = UserInput.promptForInt("\nMin Year ", 1900);
        int maxYear = UserInput.promptForInt("Max Year", 1900, 2026);
        displayVehicles(dealership.getVehiclesByYear(minYear, maxYear));

    }

    public void processGetByColorRequest(){
        String color = UserInput.promptForString("\nColor ");
        displayVehicles(dealership.getVehicleByColor(color));
    }

    public void processGetByTypeRequest(){
        String type = UserInput.promptForString("\nVehicle Type ");
        displayVehicles(dealership.getVehiclesByType(type));
    }

    public void processGetByMileageRequest(){
        int minMileage = UserInput.promptForInt("\nMin Mileage ", 1);
        int maxMileage = UserInput.promptForInt("Max Mileage ", 1);
        displayVehicles(dealership.getVehiclesByMileage(minMileage, maxMileage));
    }

    public void processAllVehiclesRequest(){
        ArrayList<Vehicle> allCars = dealership.getAllVehicles();

        this.displayVehicles(allCars);
    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }

}
