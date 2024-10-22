package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void printTable(int numberTableToPrint){
       // "1 x 2 = 2\n"
       // "2 x 2 = 4\n"
        // StringBuilder output = new StringBuilder();
         int result;
       for (int i = 1; i <= 10; i++) {
            result = i * numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + result);
       }
    }

    public static void main(String[] args) {
        printTable(2);
    }
}
