public class Main {
    public static void main(String[] args) {
       //Задача 6, переменные
     System.out.println("Task 6, variable");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a*(b+(c-d*e));
        System.out.println(result*(-1));

        System.out.println("Task 7, variable");
        //задание 7, переменные
        //Объявите целочисленные переменные a = 5 и b = 7.
        //С помощью математических манипуляций добейтесь того, чтобы a = 7 и b = 5.
        //Использовать дополнительные переменные или числа запрещено.
        int f = 10;
        int w = 3;
        f = w + f;
        w = f - w;
        f = f - w;

        System.out.println(f);
        System.out.println(w);

        System.out.println("Task 8, variable");

        int a1 = 878;
        int b1 = a1 / 10;
        while (b1 > 9) {
         b1 -= 10;
        }
        System.out.println(b1);


    }
}