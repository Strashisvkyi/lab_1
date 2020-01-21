package ua.lviv.iot.firstLab;

public class ParkList {
    public static void main(String[] args) {
        //objects
        Park centralPark = new Park();
        Park southPark = new Park("High Avenue, 43", 250.4, 2.25, false);
        Park northPark = new Park("Washington Street, 18", 406.3, 4.5, true, 54, "Johnson's Orchard", 7.8);

        System.out.println(centralPark);
        System.out.println(southPark);
        System.out.println(northPark);

        Park.printStaticCondition();
        centralPark.printCondition();

        System.out.println("\n");
        int counter = 0;
        Park[] objects = new Park[4];
        do {
            objects[counter++] = new Park();
        }
        while (counter < 4);

        for (Park newCounter : objects) {
            System.out.println(newCounter);
        }

    }
}
