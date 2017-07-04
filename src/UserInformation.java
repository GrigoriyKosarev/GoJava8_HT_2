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

        System.out.print("хобби: ");
        String hobbyUser = in.nextLine();

        System.out.print("возраст: ");
        int age = in.nextInt();

        System.out.println("----------------------------------");
        System.out.println("Вариант 1 (табличный):");
        System.out.println("Имя: "+ name);
        System.out.println("Город: "+ city);
        System.out.println("Возраст: "+ age);
        System.out.println("Хобби: "+ hobbyUser);

        System.out.println("----------------------------------");
        System.out.println("Вариант 2 (текстовый):");
        System.out.println("Человек по имени " + name + " живет в городе " + city + ".");
        System.out.println("Этому человеку " + age + " лет и любит он заниматься " + hobbyUser + ".");
        
    }
}
