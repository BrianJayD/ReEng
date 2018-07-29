package ca.uoit.csci4100u.reeng.inc;

/**
 * Created by Bashini on 2018-07-28.
 */

public class Goal {
    private String goalName;
    private String goalDescription;
    private boolean goalIsCompleted;
    private float goalProgress;

    public Goal(String goalName,String goalDescription,boolean goalIsCompleted,float goalProgress){
        this.goalName= goalName ;
        this.goalDescription =goalDescription;
        this.goalIsCompleted= goalIsCompleted;
        this.goalProgress=goalProgress;

    }


    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public boolean isGoalIsCompleted() {
        return goalIsCompleted;
    }

    public void setGoalIsCompleted(boolean goalIsCompleted) {
        this.goalIsCompleted = goalIsCompleted;
    }

    public float getGaolProgress() {
        return goalProgress;
    }

    public void setGaolProgress(float goalProgress) {
        this.goalProgress = goalProgress;
    }
}
