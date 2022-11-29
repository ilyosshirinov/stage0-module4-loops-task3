package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1+" "+n2);
        for (int i = 2; i < lastFibonacci; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries=new FibonacciSeries();
        fibonacciSeries.printFibonacci(2);
    }
}
