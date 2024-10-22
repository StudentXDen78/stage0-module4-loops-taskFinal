package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        StringBuilder line = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            int space = cathetusLength - i;
            for (int a = 1; a <= space; a++) {
                line.append(" ");
            }

            for (int s = 1; s <= i; s++) {
                line.append("*");
            }
            System.out.println(line);
            line = new StringBuilder();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
