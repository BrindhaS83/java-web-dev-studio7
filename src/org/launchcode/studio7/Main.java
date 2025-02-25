package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Mass Effect 2", 700, "HL7 v2.5", 350,"CD-R" );
        DVD dvd = new DVD("Star Wars", 4700, "R 4.7GB", 1450,"DVD-R");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println("Spin Rates:");
        cd.spinDisc();
        dvd.spinDisc();

        System.out.println("\nData Readings:");
        cd.readData();
        dvd.readData();

        System.out.println("\nWriting Data...:");
        System.out.println(cd.writeData(350));
        System.out.println(dvd.writeData(4800));

        System.out.println("\nDisk Info Summary:");
        System.out.println(cd.discInfo());
        System.out.println(dvd.discInfo());

    }
}
