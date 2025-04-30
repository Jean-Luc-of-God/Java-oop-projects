import java.time.LocalDate;
import java.util.List;

public class HumanitarianMission extends Mission {

    public HumanitarianMission(String missionId, String missionName, LocalDate missionStartDate, LocalDate missionEndDate) {
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
