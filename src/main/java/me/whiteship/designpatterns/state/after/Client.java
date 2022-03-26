package me.whiteship.designpatterns.state.after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student tester = new Student("tester");
        tester.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("safdafa", student);

        onlineCourse.addStudent(tester);

        System.out.println("onlineCourse = " + onlineCourse.getStudents());
        System.out.println("onlineCourse = " + onlineCourse.getReviews());
        System.out.println("onlineCourse = " + onlineCourse.getState());
    }
}
