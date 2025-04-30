import java.time.LocalDate;
import java.util.List;

public class ReconMission extends Mission {

    public ReconMission(String missionId, String missionName, LocalDate missionStartDate, LocalDate missionEndDate) {
        super(missionId, missionName, missionStartDate, missionEndDate);
    }

    @Override

    public void assignTask() {
        if (assignedPersonnel.size() < 2) {
            System.out.println("Error: Recon Mission requires at least 2 personnel.");
            System.exit(0);
        }

        System.out.println("Assigning reconnaissance tasks:");
        for (Personnel p : assignedPersonnel) {
            System.out.println(p.getPersonnelRole() + " " + p.getPersonnelName() + " assigned to surveillance.");
        }
    }

    @Override
    public void allocateResources() {
        boolean hasDrone = false;
        Resource[] availableResources = new Resource[0];
        for (Resource resource : availableResources) {
            if (resource.getResourceName().equalsIgnoreCase("Drone") && resource.getQuantity() > 0) {
                hasDrone = true;
                resource.setQuantity(resource.getQuantity() - 1);
                //usedResources.add(resource);
                break;
            }
        }
        if (!hasDrone) {
            System.out.println("Error: No drones available for reconnaissance.");
            System.exit(0);
        }
    }


    @Override
    public void trackMissionProgress() {
        status = "IN_PROGRESS";
        System.out.println("Recon Mission is in progress...");
        status = "COMPLETED";
        System.out.println("Recon Mission completed.");
    }


    @Override
    public void generateMissionReport() {
        System.out.println("\n--- Mission Report ---");
        System.out.println("Mission ID: " + missionId);
        System.out.println("Mission Name: " + missionName);
        System.out.println("Start Date: " + missionStartDate);
        System.out.println("End Date: " + missionEndDate);
        System.out.println("Status: " + status);
        System.out.println("Assigned Personnel:");
        for (Personnel p : assignedPersonnel) {
            System.out.println("- " + p.getPersonnelRole() + ": " + p.getPersonnelName());
        }
        System.out.println("Resources Used:");
        Resource[] usedResources = new Resource[0];
        for (Resource r : usedResources) {
            System.out.println("- " + r.getResourceName());
        }
    }

}
