package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        String x = String.valueOf(t);
        for (int i = 0; i < x.length(); i++) {
            sum += t % 10;
            t = t / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(12345);
    }
}
