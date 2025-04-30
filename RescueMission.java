import java.time.LocalDate;

public class RescueMission extends Mission {

    public RescueMission(String missionId, String missionName, LocalDate missionStartDate, LocalDate missionEndDate) {
        super(missionId, missionName, missionStartDate, missionEndDate);
    }

    @Override
    public void assignTask() {
        System.out.println("Assigning rescue tasks to all personnel.");
        for (Personnel p : assignedPersonnel) {
            System.out.println(p.getPersonnelRole() + " assigned to rescue operations.");
        }
    }

    @Override
    public void allocateResources() {
        System.out.println("Medical kits and emergency vehicles allocated.");
    }

    @Override
    public void trackMissionProgress() {
        System.out.println("Tracking progress... Mission is 50% complete.");
    }

    @Override
    public void generateMissionReport() {
        System.out.println("Mission Report:");
        System.out.println("Mission ID: " + missionId);
        System.out.println("Mission Name: " + missionName);
        System.out.println("Start Date: " + missionStartDate);
        System.out.println("End Date: " + missionEndDate);
        System.out.println("Personnel involved:");
        for (Personnel p : assignedPersonnel) {
            System.out.println("- " + p.getPersonnelRole() + ": " + p.getPersonnelName());
        }
        System.out.println("Status: " + status);
    }
}
