package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        for (int i = 9; i < lengthOfLastNumber; i = i * 10 + 9) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        NinesSum ninesSum=new NinesSum();
        ninesSum.calculateSum(1000000);
    }
}
