package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i);
        }
    }

    public static void main(String[] args) {
        AlphabetPrinter printer = new AlphabetPrinter();
        printer.printAlphabet();
    }
}
