package students.andrew_galashin.lesson_9.level_5.task_29;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry() == "Ямайка";
    }
}
