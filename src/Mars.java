
public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "X-Force";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = landingCheck(12);
        meals -= (shipPopulation * 0.75);
        meals -= (shipPopulation * 0.75);
        System.out.println(meals);
        meals += (meals * .5);
        shipPopulation += 5;
        String landingLocation = "The Ocean";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        new GuessingGame();
        new MarsExpedition();
    }
    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minutes = 0; minutes <= minutesLeft; minutes++) {
            if (((minutes % 3) == 0) && ((minutes % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minutes % 3) == 0) {
                System.out.println("Left");
            } else if ((minutes % 2) == 0) {
                System.out.println("Right");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
