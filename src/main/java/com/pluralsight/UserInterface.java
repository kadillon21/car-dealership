package com.pluralsight;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserInterface {

    Dealership dealership;

    public void display() throws FileNotFoundException {
        boolean programRunning = true;
        init();

        while (programRunning = true) {
            System.out.println("Dealership Search Engine");
            System.out.println("1) Find by price range");
            System.out.println("2) Find by make / model");
            System.out.println("3) Find by year range");
            System.out.println("4) Find by color");
            System.out.println("5) Find by mileage range");
            System.out.println("6) Find by vehicle type");
            System.out.println("7) List ALL vehicles");
            System.out.println("8) Add a vehicle");
            System.out.println("9) Remove a vehicle");
            System.out.println("10) Quit");

            switch (UserInput.promptForInt("Your choice ", 1, 10)){
                case 1:
                    dealership.getVehicleByPrice(UserInput.promptForDouble("Min ", 1), UserInput.promptForDouble("Max", 1));
                    break;
                case 2:
                    dealership.getVehiclesByMakeModel(UserInput.promptForString("Make "), UserInput.promptForString("Model "));
                    break;
                case 3:
                    dealership.getVehiclesByYear(UserInput.promptForInt("Min Year ", 1900), UserInput.promptForInt("Max Year",
                    1900, 2026));
                    break;
                case 4:
                    dealership.getVehicleByColor(UserInput.promptForString("Color "));
                    break;
                case 5:
                    dealership.getVehiclesByMileage(UserInput.promptForInt("Min Mileage ", 1), UserInput.promptForInt("Max Mileage ", 1));
                    break;
                case 6:
                    dealership.getVehiclesByType(UserInput.promptForString("Vehicle Type "));
                    break;
                case 7:
                    dealership.getAllVehicles();
                case 8:
                    dealership.addVehicle();
                case 9:
                    dealership.removeVehicle();
                case 10:
                    programRunning = false;
            }
        }

    }

    private void init() throws FileNotFoundException {

        DealershipFileManger dealershipFileManger = new DealershipFileManger();

        this.dealership =  DealershipFileManger.getDealership();

    }

    public static void displayVehicles(ArrayList<String> list){

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
