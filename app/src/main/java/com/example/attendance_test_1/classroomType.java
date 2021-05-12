package com.example.attendance_test_1;

public class classroomType {
    String course_code;
    String course_name;
    String course_professor;

    public classroomType(){}
    public classroomType(String course_code,String course_name,String course_professor){
        this.course_code=course_code;
        this.course_name=course_name;
        this.course_professor=course_professor;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_professor() {
        return course_professor;
    }

    public void setCourse_professor(String course_professor) {
        this.course_professor = course_professor;
    }
}
