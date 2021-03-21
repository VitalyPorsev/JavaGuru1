package students.rodion_afanasjev.lesson_9.level_5.task_22;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest f = new FraudDetectorTest();
        f.rule1Test();
        f.rule2Test();
        f.rule3Test();
        f.rule4Test();
        f.rule5Test();
        f.rule5AmountTest();

    }

    FraudRule[] fraudRules ={
            new Rule1("PokemonCheck"), new Rule2("AmountCheck"),
            new Rule3("SydneyCheck"), new Rule4("JamaicaCheck"),
            new Rule5("GermanyAmountCheck")
    } ;

    public void rule1Test() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokemon","Магадан");
        Transaction t = new Transaction(trader,5000);
        boolean realResult = fraudDetector.isFraud(fraudRules,t);
        equalCheck(realResult,true,"rule1Test");
    }

    public void rule2Test() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokenom","Магадан");
        Transaction t = new Transaction(trader,5000000);
        boolean realResult = fraudDetector.isFraud(fraudRules,t);
        equalCheck(realResult,true,"rule2Test");
    }

    public void rule3Test() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokenom","Сидней");
        Transaction t = new Transaction(trader,5000000);
        boolean realResult = fraudDetector.isFraud(fraudRules,t);
        equalCheck(realResult,true,"rule3Test");
    }

    public void rule4Test() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokenom","Ямайка");
        Transaction t = new Transaction(trader,5000000);
        boolean realResult = fraudDetector.isFraud(fraudRules,t);
        equalCheck(realResult,true,"rule4Test");
    }

    public void rule5Test() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokenom","Германия");
        Transaction t = new Transaction(trader,2000);
        boolean realResult = fraudDetector.isFraud(fraudRules,t);
        equalCheck(realResult,true,"rule5Test");
    }

    public void rule5AmountTest() {
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Pokenom","Германия");
        Transaction t = new Transaction(trader,100);
        boolean realResult = fraudDetector.isFraud(fraudRules,t);
        equalCheck(realResult,false,"rule5Test");
    }

    public void equalCheck(boolean realResult, boolean expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
