//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CASE1//
        System.out.println("CASE1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно подождать");
        }
        System.out.println("     ");


        //CASE2//
        System.out.println("CASE2");
        int temperature = 3;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println("     ");


        //CASE3//
        System.out.println("CASE3");
        int speed = 54;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println("     ");


        //CASE4//
        System.out.println("CASE4");
        int ageTwo = 14;
        if (ageTwo >= 2 && ageTwo <= 6) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в детский сад.");
        }
        if (ageTwo >= 7 && ageTwo <= 17) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в школу.");
        }
        if (ageTwo >= 18 && ageTwo <= 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить в университет.");
        }
        if (ageTwo > 24) {
            System.out.println("Если возраст человека равен " + ageTwo + ", то ему нужно ходить на работу.");
        }

        System.out.println("     ");

        //CASE5//
        System.out.println("CASE5");
        int ageThree = 8;
        if (ageThree < 5) {
            System.out.println("Если возраст ребёнка равен " + ageThree + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageThree >= 5 && ageThree < 14) {
            System.out.println("Если возраст ребёнка равен " + ageThree + ", он может кататься только в сопровождении взрослого.");
        }
        if (ageThree >= 14) {
            System.out.println("Если возраст ребёнка равен " + ageThree + ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println("     ");

        //CASE6//
        System.out.println("CASE6");
        int passenger = 44;
        if (passenger >= 1 && passenger <= 60) {
            System.out.println("Если пассажир под номером " + passenger + ", то его место - сидячее.");
        }
        if (passenger >= 61 && passenger <= 102) {
            System.out.println("Если пассажир под номером " + passenger + ", то его место - стоячее.");
        }
        if (passenger > 102) {
            System.out.println("Если пассажир под номером " + passenger + ", то ему не хватит места.");
        }
        System.out.println("     ");


        //CASE7//
        System.out.println("CASE7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one + " - самое большое число.");
        }
        if (two > one && two > three) {
            System.out.println(two + " - самое большое число.");
        }
        if (three > one && three > two) {
            System.out.println(three + " - самое большое число.");
        }
        System.out.println("     ");


    }
}