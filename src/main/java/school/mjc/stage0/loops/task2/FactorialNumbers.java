package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        for (int i = 0; i <= printToInclusive; i++) {
            int mult = 1;
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    continue;
                mult *= j;
            }
            System.out.println(mult);
        }
    }
}
