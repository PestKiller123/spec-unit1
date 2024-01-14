
public class Mars {
    public static void main(String[] args) {
        String colonyName = "X-Force";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
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
    }
}
