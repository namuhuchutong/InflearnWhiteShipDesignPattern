package me.whiteship.designpatterns.state.after;


public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}