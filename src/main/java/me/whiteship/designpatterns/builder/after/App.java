package me.whiteship.designpatterns.builder.after;

import me.whiteship.designpatterns.builder.before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
//        TourPlanBuilder builder = new DefaultTourBuilder();
//        TourPlan plan = builder.title("test tour")
//                .nightsAndDays(2, 3,)
//                .startDate(LocalDate.of(2022, 12, 13))
//                .whereToStay("Resort")
//                .addPlan(0, "test 1 ")
//                .addPlan(1, "test 2")
//                .getPlan();
//
//        TourPlan longBeachTrip = builder.title("long beach")
//                .startDate(LocalDate.of(2002, 1, 1))
//                .getPlan();

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();

    }

}
