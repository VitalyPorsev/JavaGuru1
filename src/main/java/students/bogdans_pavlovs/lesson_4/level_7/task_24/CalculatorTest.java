package students.bogdans_pavlovs.lesson_4.level_7.task_24;

/*
Дан класс Calculator и его тест CalculatorTest.
Найдите способ упростить тесты в CalculatorTest.

Тесты тоже должны быть написаны как можно лучше и качественнее!
Дублирование кода - это почти всегда плохая идея в программировании.
Поэтому от дублирования кода нужно избавляться.

Подсказка: вынесите в отдельный метод проверку
результата и замените её вызовом метода в каждом тесте.
 */




class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 75;

        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        int result = calculator.sum(firstNumber, secondNumber);
        calculatorTest.expectedResult1(result, expectedResult);
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int expectedResult = 20;

        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        int result = calculator.sub(firstNumber, secondNumber);
        calculatorTest.expectedResult1(result, expectedResult);
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;

        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        int result = calculator.mul(firstNumber, secondNumber);
        calculatorTest.expectedResult1(result, expectedResult);
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        int result = calculator.div(firstNumber, secondNumber);
        calculatorTest.expectedResult1(result, expectedResult);
    }

    public void isEvenTest1() {
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        boolean result = calculator.isEven(40);
        calculatorTest.expectedResult2(result, expectedResult);
    }

    public void isEvenTest2() {
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        boolean result = calculator.isEven(41);
        calculatorTest.expectedResult2(result, expectedResult);
    }

    public void expectedResult1(int result, int expectedResult){

        if (result == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void expectedResult2(boolean result, boolean expectedResult){

        if (result == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }



}
