import java.util.InputMismatchException;
import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Booting....");
        Thread.sleep(1000);
        System.out.println("....");
        Thread.sleep(1000);
        System.out.println("Loading Mars Expedition Prep Program!");
        Thread.sleep(1000);
        System.out.println("....");
        Thread.sleep(1000);
        System.out.println("Welcome....");
        Thread.sleep(500);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String yesOrNo = input.nextLine();

        if (yesOrNo.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (yesOrNo.equalsIgnoreCase("N")) {
            System.out.println("Too bad you are team leader. You have to go.");
        } else {
            System.out.println("No amount of giberish will change the fact that you have to go team leader.");
        }

        Thread.sleep(500);

        System.out.println("How many more team members do you want?");
        int teamSize = input.nextInt();
            input.nextLine();
        if (teamSize > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need 2 more members.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That is the perfect amount of people!");
        }

        Thread.sleep(500);

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        Thread.sleep(500);

        System.out.println("""
                You have the choice of 3 vehicles
                A: Mars Rover
                B: Billy the horse
                C: Chevy Corvette""");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "Billy the horse";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "Chevy Corvette";
        } else {
            vehicleChoice = "your feet";
        }
        System.out.println("Good job, " + name + ". You have " + teamSize + " team members. You are bringing a " + snack + " to snack on. You and your team " +
                "will be exploring Mars with " + vehicleChoice + "." +
                "\nYour team heads out in..." +
                "\n5!" +
                "\n4!" +
                "\n3!" +
                "\n2!" +
                "\n1!" +
                "\nExploration team you are clear to go!");
    }
}
