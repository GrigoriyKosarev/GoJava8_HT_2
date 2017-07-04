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


    }
}
