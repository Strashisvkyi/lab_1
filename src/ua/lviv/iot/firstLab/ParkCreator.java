package ua.lviv.iot.firstLab;

public class ParkCreator {
    private static final int NUMBER_OF_NEWLY_BUILT_PARKS = 4;

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

        int parkIterator = 0;
        Park[] parks = new Park[NUMBER_OF_NEWLY_BUILT_PARKS];
        do {
            parks[parkIterator++] = new Park();
        }
        while (parkIterator < NUMBER_OF_NEWLY_BUILT_PARKS);

        for (Park park : parks) {
            System.out.println(park);
        }

    }
}