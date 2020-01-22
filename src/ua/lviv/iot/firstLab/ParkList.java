package ua.lviv.iot.firstLab;

public class ParkList {
    private static int numberOfNewlyBuildParks = 4;

    public static void main(String[] args) {
        //objects
        Park centralPark = new Park();
        Park southPark = new Park("High Avenue, 43", 250.4, 2.25, false);
        Park northPark = new Park("Washington Street, 18", 406.3, 4.5, true, 54, "Johnson's Orchard", 7.8);

        System.out.println(centralPark);
        System.out.println(southPark);
        System.out.println(northPark);

        Park.printStaticMoneyForMaintainingInHryvnias();
        centralPark.printMoneyForMaintainingInHryvnias();

        System.out.println("\n");

        int counter = 0;
        Park[] objects = new Park[numberOfNewlyBuildParks];
        do {
            objects[counter++] = new Park();
        }
        while (counter < numberOfNewlyBuildParks);

        for (Park park : objects) {
            System.out.println(park);
        }

    }
}