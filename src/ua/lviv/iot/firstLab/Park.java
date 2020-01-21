package ua.lviv.iot.firstLab;

public class Park {
    //fields
    private String adress = "none";
    private double lengthOfCycleTrack = 0;
    private double ticketPrice = 0;
    private boolean playgroundPresence = false;
    private int numberOfBenches = 0;
    public static final String CONDITION = "satisfactory";
    protected String name = "none";
    protected double parkAreaInHectares = 0;


    //Getters
    public String getAdress() {
        return adress;
    }

    public double getLengthOfCycleTrack() {
        return lengthOfCycleTrack;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public boolean getPlaygroundPresence() {
        return playgroundPresence;
    }

    public int getNumberOfBenches() {
        return numberOfBenches;
    }

    //Setters
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setLengthOfCycleTrack(double lengthOfCycleTrack) {
        this.lengthOfCycleTrack = lengthOfCycleTrack;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setPlaygroundPresence(boolean playgroundPresence) {
        this.playgroundPresence = playgroundPresence;
    }

    public void setNumberOfBenches(int numberOfBenches) {
        this.numberOfBenches = numberOfBenches;
    }

    //Constructors
    public Park() {

    }

    public Park(String adress, double lengthOfCycleTrack, double ticketPrice, boolean playgroundPresence) {
        this.adress = adress;
        this.lengthOfCycleTrack = lengthOfCycleTrack;
        this.ticketPrice = ticketPrice;
        this.playgroundPresence = playgroundPresence;
    }

    public Park(String adress, double lengthOfCycleTrack, double ticketPrice, boolean playgroundPresence, int numberOfBenches, String name, double parkAreaInHectares) {
        this.adress = adress;
        this.lengthOfCycleTrack = lengthOfCycleTrack;
        this.ticketPrice = ticketPrice;
        this.playgroundPresence = playgroundPresence;
        this.numberOfBenches = numberOfBenches;
        this.name = name;
        this.parkAreaInHectares = parkAreaInHectares;

    }

    //toString method
    public String toString() {
        String newString;
        if (adress.equals("none")) {
            newString = " There is no information about this park \n";
        } else if (name.equals("none") && playgroundPresence == true) {
            newString = " This is the park at " + adress + "\n Length of cycle track: " + lengthOfCycleTrack + "\n Ticket price: " + ticketPrice + "\n The playground is present" + "\n";
        } else if (name.equals("none") && playgroundPresence == false) {
            newString = " This is the park at " + adress + "\n Length of cycle track: " + lengthOfCycleTrack + "\n Ticket price: " + ticketPrice + "\n The playground is absent" + "\n";
        } else if (playgroundPresence == true) {
            newString = " This is the park \n Name: " + name + "\n Adress: " + adress + "\n The area it takes in hectares is: " + parkAreaInHectares + "\n Length of cycle track: " + lengthOfCycleTrack + "\n Ticket price: " + ticketPrice + "\n Number of benches in the whole park: " + numberOfBenches + "\n The playground is present" + "\n";
        } else {
            newString = " This is the park \n Name: " + name + "\n Adress: " + adress + "\n The area it takes in hectares is: " + parkAreaInHectares + "\n Length of cycle track: " + lengthOfCycleTrack + "\n Ticket price: " + ticketPrice + "\n Number of benches in the whole park: " + numberOfBenches + "\n The playground is absent" + "\n";
        }
        return newString;
    }

    //methods which print the information about the static field
    public static void printStaticCondition() {
        System.out.println("The condition of every park is " + CONDITION);
    }

    public void printCondition() {
        System.out.println("The condition of this park is " + CONDITION);
    }


    //methods which reset values if needed
    public void resetAdress(String adress) {
        this.adress = adress;
    }

    public void resetLengthOfCycleTrack(double lengthOfCycleTrack) {
        this.lengthOfCycleTrack = lengthOfCycleTrack;
    }

    public void resetTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void resetPlaygroundPresence(boolean playgroundPresence) {
        this.playgroundPresence = playgroundPresence;
    }

    public void resetNumberOfBenches(int numberOfBenches) {
        this.numberOfBenches = numberOfBenches;
    }

}
