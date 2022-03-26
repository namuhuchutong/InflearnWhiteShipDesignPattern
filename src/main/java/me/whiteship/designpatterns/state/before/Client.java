package me.whiteship.designpatterns.state.before;

public class Client {

    public static void main(String[] args) {
        Student student = new Student("pepper mill");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student tester = new Student("tester");
        tester.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(tester);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
