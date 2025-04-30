public class Personnel {
    private String personnelId;
    private String personnelName;
    private String personnelRole;

    public Personnel(String personnelId, String personnelName, String personnelRole) {
        this.personnelId = personnelId;
        this.personnelName = personnelName;
        this.personnelRole = personnelRole;
    }

    public String getPersonnelRole() {
        return personnelRole;
    }

    public String getPersonnelName() {
        return personnelName;
    }
}

