package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        StringBuilder line = new StringBuilder();
        for (int i = 1; i <= cathetusLength; i++) {
            int space = cathetusLength - i;
            for (int a = 1; a <= space; a++) {
                line.append(" ");
            }

            for (int s = i; s > 0; s--) {
                line.append(s);
            }

            for (int d = 2; d <= i; d++) {
                line.append(d);
            }
            System.out.println(line);
            line = new StringBuilder();
        }



    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
