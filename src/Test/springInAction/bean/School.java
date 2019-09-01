package springInAction.bean;

import org.springframework.stereotype.Component;


public class School {

    private String schoolName = "fuYang";
    private Student student;

    public School(Student student) {
        this.student = student;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return student+"->"+schoolName;
    }
}
