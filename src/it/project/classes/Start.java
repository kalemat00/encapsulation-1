package it.project.classes;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void main(String...args){
        House home = new House();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Insert the address: ");
        String addressInput = scanner.nextLine();
        System.out.println("Address of the house: " + addressInput);
        home.setAddress(addressInput);


        System.out.println("Insert the number of floors: ");
        int floorsNumberInput = scanner.nextInt();
        scanner.nextLine();                                                //I've read that this is used also to clean
                                                                           //the buffer of the scanner variable
        System.out.println("number of floors: " + floorsNumberInput);
        home.setFloorsNumber(floorsNumberInput);


        System.out.println("Insert the resident of the house separate by a comma");
        String listOfNames = scanner.nextLine();
        String[] residentName = listOfNames.split(",");


        //System.out.println("the array: " + listOfNames);
        //System.out.println("the array: " + residentName[0] + residentName[1] + residentName[2]);

        home.setResidentNames(residentName);


        System.out.println("\n-----------------\n" +
                "House Details: " + "\n" +
                "The address of the house is: " + home.getAddress() + "\n" +
                "The number of floors of the house is: " + home.getFloorsNumber() + "\n" +
                "The people living in the house are: " + Arrays.toString(home.getResidentNames())
        );
    }
}
