import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MissionManagementSystem {

    public static void main(String[] args) {
        // Handling no input scenario for Docker by using command-line args or default values
        Scanner scanner = args.length == 0 ? new Scanner(System.in) : null; // Allow default values if no input args

        int missionChoice = 0;

        if (scanner != null) {
            // Prompt for mission type if running interactively
            System.out.println("Choose a mission type: ");
            System.out.println("1. Recon Mission");
            System.out.println("2. Rescue Mission");
            System.out.println("3. Combat Mission");
            System.out.println("4. Humanitarian Mission");

            missionChoice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left by nextInt()
        } else {
            // If no scanner, use command-line args or default values
            missionChoice = (args.length > 0) ? Integer.parseInt(args[0]) : 1;
        }

        Mission mission = null;
        LocalDate currentDate = LocalDate.now();
        LocalDate missionStartDate = currentDate;
        LocalDate missionEndDate = currentDate.plusDays(10);

        // Select mission based on user input
        switch (missionChoice) {
            case 1:
                mission = new ReconMission("R1", "Recon Mission", missionStartDate, missionEndDate);
                break;
            case 2:
                mission = new RescueMission("R2", "Rescue Mission", missionStartDate, missionEndDate);
                break;
            case 3:
                mission = new CombatMission("C1", "Combat Mission", missionStartDate, missionEndDate);
                break;
            case 4:
                mission = new HumanitarianMission("H1", "Humanitarian Mission", missionStartDate, missionEndDate);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        // Collect personnel information
        ArrayList<Personnel> personnelList = new ArrayList<>();

        if (scanner != null) {
            System.out.println("Enter number of personnel: ");
            int numPersonnel = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < numPersonnel; i++) {
                System.out.println("Enter personnel ID: ");
                String personnelId = scanner.nextLine();
                System.out.println("Enter personnel name: ");
                String personnelName = scanner.nextLine();
                System.out.println("Enter personnel role: ");
                String personnelRole = scanner.nextLine();
                Personnel personnel = new Personnel(personnelId, personnelName, personnelRole);
                personnelList.add(personnel);
            }
        } else {
            // For Docker and non-interactive testing, default personnel info
            personnelList.add(new Personnel("P1", "John Doe", "Leader"));
            personnelList.add(new Personnel("P2", "Jane Smith", "Medic"));
        }

        mission.assignedPersonnel = personnelList;

        // Validate personnel and mission dates
        if (!mission.validatePersonnel()) {
            System.out.println("Personnel assignment is invalid.");
            return;
        }

        if (!mission.validateMissionDates()) {
            System.out.println("Mission start date must be before the end date.");
            return;
        }

        // Assign tasks and manage the mission
        mission.assignTask();
        mission.allocateResources();
        mission.trackMissionProgress();
        mission.generateMissionReport();
    }
}
