package students.vitaly_porsev.lesson_14.level_2.allTasks;

public class AppleLightWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
