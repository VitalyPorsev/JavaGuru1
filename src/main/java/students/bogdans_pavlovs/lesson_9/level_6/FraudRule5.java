package students.bogdans_pavlovs.lesson_9.level_6;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCity().equals("Germany") && t.getAmount() > 1000);
    }

}
