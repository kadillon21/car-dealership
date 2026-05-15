package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManger {

    public static Dealership getDealership() throws FileNotFoundException {
        ArrayList<Vehicle> inventory = new ArrayList<>();
        String dealershipName = "";
        String dealershipAddress = "";
        String dealershipPhoneNumber = "";

        try{
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            String dealershipInfo;

            dealershipInfo = bufferedReader.readLine();
            String[] split = dealershipInfo.split("\\|");
            dealershipName = split[0];
            dealershipAddress = split[1];
            dealershipPhoneNumber = split[2];

            while((input = bufferedReader.readLine()) != null){
                String[] parts = input.split("\\|");
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String vehicleType = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);

                inventory.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));

            }

            bufferedReader.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }

        return new Dealership(dealershipName, dealershipAddress, dealershipPhoneNumber, inventory);
    }

    public static void saveDealership(){

    }

}
