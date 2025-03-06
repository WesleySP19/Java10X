import java.util.ArrayList;
import java.util.Scanner;

// Class representing a Mission
class Mission {
    private String name;
    private char difficultyLevel;
    private String status;

    public Mission(String name, char difficultyLevel) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.status = "not completed"; // Initial status
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public char getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// Class representing a Ninja
class Ninja {
    private String name;
    private int age;
    private Mission mission;

    public Ninja(String name, int age, Mission mission) {
        this.name = name;
        this.age = age;
        this.mission = mission;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Mission getMission() {
        return mission;
    }
}

// Main class containing the program logic
public class NinjaMissionApp {
    private static ArrayList<Ninja> ninjas = new ArrayList<>(); // List of ninjas
    private static Scanner scanner = new Scanner(System.in); // Scanner for user input

    public static void main(String[] args) {
        int option;
        do {
            // Interactive menu
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Ninja");
            System.out.println("2. List Ninjas and Missions");
            System.out.println("3. Check Mission Completion");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    addNinja();
                    break;
                case 2:
                    listNinjas();
                    break;
                case 3:
                    checkMissions();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 0);
    }

    // Method to add a ninja
    public static void addNinja() {
        System.out.print("Enter ninja's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ninja's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        System.out.print("Enter mission name: ");
        String missionName = scanner.nextLine();

        System.out.print("Enter mission difficulty level (A, B, C, D): ");
        char difficultyLevel = scanner.nextLine().charAt(0);

        // Create the mission and ninja
        Mission mission = new Mission(missionName, difficultyLevel);
        Ninja ninja = new Ninja(name, age, mission);

        // Add the ninja to the list
        ninjas.add(ninja);
        System.out.println("Ninja added successfully!");
    }

    // Method to list all ninjas and their missions
    public static void listNinjas() {
        if (ninjas.isEmpty()) {
            System.out.println("No ninjas registered!");
        } else {
            for (Ninja ninja : ninjas) {
                System.out.println("Ninja: " + ninja.getName() +
                        ", Age: " + ninja.getAge() +
                        ", Mission: " + ninja.getMission().getName() +
                        ", Difficulty: " + ninja.getMission().getDifficultyLevel() +
                        ", Status: " + ninja.getMission().getStatus());
            }
        }
    }

    // Method to check the completion status of all missions
    public static void checkMissions() {
        for (Ninja ninja : ninjas) {
            canCompleteMission(ninja);
        }
        System.out.println("Mission status updated!");
    }

    // Method to check if a ninja can complete a mission
    public static void canCompleteMission(Ninja ninja) {
        Mission mission = ninja.getMission();
        int age = ninja.getAge();
        char difficultyLevel = mission.getDifficultyLevel();

        if (age < 15 && (difficultyLevel == 'C' || difficultyLevel == 'D')) {
            mission.setStatus("completed");
        } else if (age >= 15) {
            mission.setStatus("completed");
        } else {
            mission.setStatus("not completed");
        }
    }
}