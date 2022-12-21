package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int newNumber = (number / 100) + (number % 10 * 100) + (number / 10 % 10 * 10);
        System.out.println(newNumber);
    }
}
