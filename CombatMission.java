import java.time.LocalDate;
import java.util.List;

public class CombatMission extends Mission {

    public CombatMission(String missionId, String missionName, LocalDate missionStartDate, LocalDate missionEndDate) {
        super(missionId, missionName, missionStartDate, missionEndDate);
    }

    @Override
    public void assignTask() {
    }

    @Override
    public void allocateResources() {
    }

    @Override
    public void trackMissionProgress() {
    }

    @Override
    public void generateMissionReport() {
    }
}
