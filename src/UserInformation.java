import java.util.Scanner;

/**
 * Created by admin on 04.07.2017.
 */
public class UserInformation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("город проживания: ");
        String city = in.nextLine();

        System.out.print("возраст: ");
        int age = in.nextInt();

        System.out.print("хобби: ");
        String hobby = in.nextLine();

        System.out.println("----------------------------------");
        System.out.println("Вариант 1 (табличный):");
        System.out.println("Имя: "+ name);
        System.out.println("Город: "+ city);
        System.out.println("Возраст: "+ age);
        System.out.println("Хобби: "+ hobby);

    }
}
