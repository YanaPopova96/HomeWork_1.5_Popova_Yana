public class Main {
    public static void main(String[] args) {
        // Разбор задач с видео-урока
        int[] weights = new int[]{90,91,93,92,85,87,88,89,0,0,0,0};
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        // Задание 1
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float [] figure = {1.57f,7.654f,9.986f};
        boolean [] trueFalse = {true,false,true,true,false};

        // Задание 2
        // System.out.println(numbers[0] + "," + numbers[1]+","+numbers[2]);
        // System.out.println(figure[0] + "," + figure[1] + "," + figure[2]);
        // System.out.println(trueFalse[0] + "," + trueFalse[1] + "," + trueFalse[2] + "," + trueFalse[3] + "," + trueFalse[4]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i!=numbers.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < figure.length; i++) {
            System.out.print(figure[i]);
            if (i!=figure.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < trueFalse.length; i++) {
            System.out.print(trueFalse[i]);
            if (i!=trueFalse.length-1) {
                System.out.print(", ");
            }
        }
        // Задание 3
        System.out.println();
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i!=0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = figure.length-1; i >= 0; i--) {
            System.out.print(figure[i]);
            if (i!=0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = trueFalse.length-1; i >= 0; i--) {
            System.out.print(trueFalse[i]);
            if (i!=0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i]++;
            }
            System.out.print(numbers[i]);
            if (i!=numbers.length-1) {
                System.out.print(", ");
        }

        }

    }
}