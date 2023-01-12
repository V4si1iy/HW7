public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int sum = 0;
        int countMonth = 0;
        System.out.println("Задание 1");
        while (sum < 2459000) {
            countMonth++;
            sum += (sum / 100 * 1);
            sum += 15000;
            System.out.println("Месяц " + countMonth + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task2() {
        int i = 0;
        System.out.println("Задание 2");
        while (i <= 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int sum = 12000000;
        System.out.println("Задание 3");
        for (int i = 2; i <= 10; i++) {
            sum = sum + (sum / 1000 * 17) - (sum / 1000 * 8);
            System.out.println("Год " + i + " численность населения составляет " + sum);

        }
    }

    public static void task4() {
        double sum = 0;
        int countMonth = 0;
        System.out.println("Задание 4");
        while (sum < 12000000) {
            countMonth++;
            sum += (sum / 100 * 7);
            sum += 15000;
            System.out.println("Месяц " + countMonth + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task5() {
        double sum = 0;
        int countMonth = 0;
        System.out.println("Задание 5");
        while (sum < 12000000) {
            countMonth++;
            sum += (sum / 100 * 7);
            sum += 15000;
            if (countMonth % 6 == 0)
                System.out.println("Месяц " + countMonth + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task6() {
        int sum = 0;
        int countMonth = 0;
        System.out.println("Задание 6");
        while (countMonth <= 12 * 9) {
            countMonth++;
            sum += (sum / 100 * 7);
            sum += 15000;
            if (countMonth % 6 == 0)
                System.out.println("Год " + countMonth / 12 + " Месяц " + countMonth + " сумма накоплений равна " + sum + " рублей");
        }
    }

    public static void task7() {
        int firstFriday = 5;
        int sum = firstFriday;
        System.out.println("Задание 7");
        while (sum <= 31) {
            System.out.println("Сегодня пятница, " + sum + "-е число");
            sum += 7;
        }
    }

    public static void task8() {
        int firstFriday = 5;
        int sum = firstFriday;
        System.out.println("Задание 8");
        for (int i = 0; i <= 2123; i += 79) {
            if (i >= 2023 - 200)
                System.out.println(i);
        }
    }
}