public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println();

        int[] firstArr = new int[]{1, 2, 3};
        double[] secondArr = {1.57, 7.654, 9.986};
        int[] week = {1, 2, 3, 4, 5, 6, 7};

        System.out.println();

        System.out.println("Задание 2");
        System.out.println();

        System.out.print(firstArr[0] + ", " + firstArr[1] + ", " + firstArr[2]);
        System.out.println();
        System.out.print(secondArr[0] + ", " + secondArr[1] + ", " + secondArr[2]);
        System.out.println();
        System.out.print(week[0] + ", " + week[1] + ", " + week[2] + ", " + week[3] + ", " + week[4] + ", " + week[5] + ", " + week[6]);
        System.out.println();

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        System.out.print(firstArr[2] + ", " + firstArr[1] + ", " + firstArr[0]);
        System.out.println();
        System.out.print(secondArr[2] + ", " + secondArr[1] + ", " + secondArr[0]);
        System.out.println();
        System.out.print(week[6] + ", " + week[5] + ", " + week[4] + ", " + week[3] + ", " + week[2] + ", " + week[1] + ", " + week[0]);
        System.out.println();
        System.out.println();
        System.out.println("Задание 4");
        System.out.println();

        int i = 0;
        for (i = 0; i < firstArr.length; i++) {
            if (firstArr[i] % 2 != 0) {
                firstArr[i] = firstArr[i] + 1;
            }
        }
        System.out.print(firstArr[0] + " " + firstArr[1] + " " + firstArr[2]);

        System.out.println();

    }


}