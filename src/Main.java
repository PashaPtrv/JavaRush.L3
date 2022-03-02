import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        //Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите размер зарплаты: ");
        int salary = scanner.nextInt();
        System.out.println("Введите колличество лет: ");
        int years = scanner.nextInt();
        System.out.println(name + " получает " + salary + " через" + years + " лет");


    }
}



