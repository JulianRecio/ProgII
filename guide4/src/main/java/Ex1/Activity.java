package Ex1;

import java.util.List;

public class Activity {

    private String activityName;

    private ActivityType activityType;

    private List<Person> studentList;

    private List<Person> teacherList;

    public Activity(String activityName, ActivityType activityType, List<Person> studentList, List<Person> teacherList) {
        this.activityName = activityName;
        this.activityType = activityType;
        this.studentList = studentList;
        this.teacherList = teacherList;
    }


    public String getActivityName() {
        return activityName;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public List<Person> getStudentList() {
        return studentList;
    }

    public List<Person> getTeacherList() {
        return teacherList;
    }
}
