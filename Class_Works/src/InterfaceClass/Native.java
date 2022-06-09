package src.InterfaceClass;

public class Native extends Cohorts {
    private final String name;
    private final String id;
    private final String cohortName;
    private String workStatus;
    private String sleepStatus;
    private String eatStatus;

    public Native(String name, String id, String cohortName) {
        this.name = name;
        this.id = id;
        this.cohortName = cohortName;
    }

    @Override
    public void goToWork() {
        this.workStatus = "I will be at the office.";

    }

    @Override
    public void goToBed() {
        this.sleepStatus = "I will sleep soon";
    }

    @Override
    public void isEating() {
        this.eatStatus = "I am eating";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCohortName() {
        return cohortName;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public String getSleepStatus() {
        return sleepStatus;
    }

    public String getEatStatus() {
        return eatStatus;
    }

    @Override
    public void birds() {

    }

}
