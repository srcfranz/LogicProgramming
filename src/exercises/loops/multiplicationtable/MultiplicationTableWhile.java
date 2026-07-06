package exercises.loops.multiplicationtable;

public class MultiplicationTableWhile {

    public static void main(String[] args) {

        System.out.println("Algorithm that displays multiplication tables from 0 to 10 implemented using a while loop");
        int i = 0;
        while (i <= 10) {
            System.out.println("Multiplication table of " + i);
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + j * i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}