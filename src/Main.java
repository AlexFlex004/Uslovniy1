//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CASE1//
        System.out.println("CASE1");
 int age = 18;
 if (age >= 18) {
     System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
 }
 else {
     System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно подождать");
 }
        System.out.println("     ");


 //CASE2//
 System.out.println("CASE2");
 int T = 3;
 if (T >= 5) {
     System.out.println("Сегодня тепло, можно идти без шапки");
 }
 else {
     System.out.println("На улице холодно, нужно надеть шапку");
 }
        System.out.println("     ");


 //CASE3//
 System.out.println("CASE3");
 int S = 54;
 if (S > 60) {
     System.out.println("Если скорость " + S + ", придётся заплатить штраф.");
 }
 else {
     System.out.println("Если скорость " + S + ", то можно ездить спокойно.");
 }
 System.out.println("     ");


 //CASE4//
 System.out.println("CASE4");
 int age2 = 14;
 if (age2 >= 2 && age2 <= 6) {
     System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
 }
 if (age2 >= 7 && age2 <= 17) {
     System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
 }
 if (age2 >= 18 && age2 <= 24) {
     System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет.");
 }
 if (age2 > 24) {
     System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу.");
   }

     System.out.println("     ");

  //CASE5//
 System.out.println("CASE5");
 int age3 = 8;
 if (age3 < 5) {
    System.out.println("Если возраст ребёнка равен " + age3 + ", то ему нельзя кататься на аттракционе.");
 }
 if (age3 >= 5 && age3 < 14) {
    System.out.println("Если возраст ребёнка равен " + age3 + ", он может кататься только в сопровождении взрослого.");
 }
 if (age3 >= 14) {
    System.out.println("Если возраст ребёнка равен " + age3 + ", то он может кататься без сопровождения взрослого.");
 }
    System.out.println("     ");

 //CASE6//
 System.out.println("CASE6");
 int passenger = 44;
 if (passenger >= 1 && passenger <=60) {
      System.out.println("Если пассажир под номером " + age3 + ", то его место - сидячее.");
 }
 if (passenger >= 61 && passenger <=102) {
      System.out.println("Если пассажир под номером " + age3 + ", то его место - стоячее.");
 }
 if (passenger > 102) {
      System.out.println("Если пассажир под номером " + age3 + ", то ему не хватит места.");
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