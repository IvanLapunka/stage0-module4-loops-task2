package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int sgn = (int)Math.signum(multiplyByAndToInclusive);
        multiplyByAndToInclusive *= sgn;
        while (i <= multiplyByAndToInclusive) {
            System.out.println(i * multiplyByAndToInclusive * sgn);
            i++;
        }
    }
}
