package exercises.loops.multiplicationtable;

public class MultiplicationTableFor {

    public static void main(String[] args) {

        System.out.println("Algorithm that displays multiplication tables from 0 to 10 implemented using a for loop");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Multiplication table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + j * i);
            }
            System.out.println();
        }
    }
}