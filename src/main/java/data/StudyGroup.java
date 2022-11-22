package data;

import service.DataService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private List<Teacher> teacher;
    private List<Student> students;

    public StudyGroup(List<Teacher> teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public List<Teacher>  getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
