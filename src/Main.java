import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        //Ввести с клавиатуры два имени и вывести надпись:
        //name1 проспонсировал name2, и она стала известной певицей.
        System.out.println("Введите имя спонсора: ");
        String name1 = scanner.nextLine();
        System.out.println("Введите имя певицы: ");
        String name2 = scanner.nextLine();
        System.out.println(name1 + " проспонсировал " + name2 + " и она стала певицей");


    }
}



