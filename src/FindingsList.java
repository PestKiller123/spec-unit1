import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Welcome Back! What did you find?");
        ArrayList<String> rockList = new ArrayList<String>();
        System.out.println("Downloading Rock Data");
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");
        System.out.println(rockList);
        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");
        rockList.remove("not rock");
        System.out.println(rockList);
        Thread.sleep(1500);
        HashMap<String, String> fossilDirectory = new HashMap<String, String >();
        fossilDirectory.put("bird", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("fish", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("tooth", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine().toLowerCase();
        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        Thread.sleep(1200);
        HashSet<String> supplies = new HashSet<String>();
        supplies.add("Oxygen");
        supplies.add("food");
        supplies.add("water");
        System.out.println("supplies before expedition\n" + supplies);
        supplies.remove("water");
        System.out.println("remaining supplies \n" + supplies);
    }
}
