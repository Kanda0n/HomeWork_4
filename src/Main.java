public class Main {
    public static void main(String[] args) {

        System.out.println("Домашняя работа по теме Условные операторы1");

        System.out.println("Task 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Task 2");
        int temp = 5;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов. Это холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, целых " + temp + " градусов, можно идти без шапки.");
        }

        System.out.println("Task 3");
        int speed = 49;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }

        System.out.println("Task 4");
        int ageForInstitution = 23;
        if (ageForInstitution > 24) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить на работу.");
        } else if (ageForInstitution >= 18) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить в университет.");
        } else if (ageForInstitution >= 7) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить в школу.");
        } else if (ageForInstitution >= 2) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить в детский сад.");
        }

        System.out.println("Task 5");
        int ageForAttraction = 13;
        if (ageForAttraction < 5) {
            System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему нельзя кататься на аттракционе.");
        } else if (ageForAttraction < 14) {
            System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему можно кататься на аттракционе в сопровождении.");
        } else if (ageForAttraction >= 14) {
            System.out.println("Если возраст ребенка равен " + ageForInstitution + ", то ему можно кататься без сопровождения взрослого.");
        }
        System.out.println("Task 6");
        int place = 101;
        if (place >= 102) {
            System.out.println("Вагон уже полностью забит!");
        } else if (place >= 60) {
            System.out.println("В вагоне остались только стоячие места.");
        } else {
            System.out.println("В вагоне есть сидячие и стоячие места.");
        }
        System.out.println("Task 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }

    }
}