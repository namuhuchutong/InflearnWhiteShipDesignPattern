package me.whiteship.designpatterns.builder.after;

import me.whiteship.designpatterns.builder.before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return  tourPlanBuilder.title("test tour")
                               .nightsAndDays(2, 3,)
                               .startDate(LocalDate.of(2022, 12, 13))
                               .whereToStay("Resort")
                               .addPlan(0, "test 1 ")
                               .addPlan(1, "test 2")
                               .getPlan();
    }
}
