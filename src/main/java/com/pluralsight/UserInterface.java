package com.pluralsight;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserInterface {

    Dealership dealership;

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
                    double minPrice = UserInput.promptForInt("Minimum price ", 1);
                    double maxPrice = UserInput.promptForInt("Maximum price ", 1);
                    displayVehicles(dealership.getVehicleByPrice(minPrice, maxPrice));
                    break;
                case 2:
                    String make = UserInput.promptForString("Make ");
                    String model = UserInput.promptForString("Model ");
                    displayVehicles(dealership.getVehiclesByMakeModel(make, model));
                    break;
                case 3:
                    int minYear = UserInput.promptForInt("\nMin Year ", 1900);
                    int maxYear = UserInput.promptForInt("Max Year", 1900, 2026);
                    displayVehicles(dealership.getVehicleByPrice(minYear, maxYear));
                    break;
                case 4:
                    String color = UserInput.promptForString("\nColor ");
                    displayVehicles(dealership.getVehicleByColor(color));
                    break;
                case 5:
                    int minMileage = UserInput.promptForInt("\nMin Mileage ", 1);
                    int maxMileage = UserInput.promptForInt("Max Mileage ", 1);
                    displayVehicles(dealership.getVehiclesByMileage(minMileage, maxMileage));
                    break;
                case 6:
                    String type = UserInput.promptForString("\nVehicle Type ");
                    displayVehicles(dealership.getVehiclesByType(type));
                    break;
                case 7:
                    System.out.println();
                    processAllVehiclesRequest();
                    displayVehicles(dealership.getAllVehicles());
                case 8:
                    System.out.println();
                    processAddVehicleRequest();
                case 9:
                    System.out.println();
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

    public static void displayVehicles(ArrayList<Vehicle> list){

    }

    public static void processAllVehiclesRequest(){

    }

    public static void processAddVehicleRequest(){

    }

    public static void processRemoveVehicleRequest(){

    }

    public static void processGetByPrice(){

    }
}
