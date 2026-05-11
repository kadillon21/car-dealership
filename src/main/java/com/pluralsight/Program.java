package com.pluralsight;

import java.io.FileNotFoundException;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {
        UserInterface ui = new UserInterface();

        DealershipFileManger.getDealership();
        ui.display();


    }
}
