package exercises.loops.multiplicationtable;

public class MultiplicationTableDoWhile {

    public static void main(String[] args) {

        System.out.println("Algorithm that displays multiplication tables from 0 to 10 implemented using a do-while loop");
        int i = 0;
        do {
            System.out.println("Multiplication table of " + i);
            int j = 1;
            do {
                System.out.println(i + " x " + j + " = " + j * i);
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= 10);
    }
}