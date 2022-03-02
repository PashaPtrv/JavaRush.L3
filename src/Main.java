import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ввести с клавиатуры число и имя, вывести на экран строку:
        //«имя» захватит мир через «число» лет. Му-ха-ха!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя захватчика: ");
        String name = scanner.nextLine();
        System.out.println("Введите колличество лет: ");
        int num = scanner.nextInt();
        System.out.println(name + " захватит мир через " + num + " лет Му-ха-ха!");

    }
}



