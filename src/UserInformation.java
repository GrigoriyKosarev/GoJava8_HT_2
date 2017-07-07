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
        in.nextLine();

        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Дружыще, как будем выводить данные? Выбери номер варианта: ");
        System.out.println("");
        System.out.println("Вариант 1 (табличный)");
        System.out.println("Вариант 2 (текстовый)");
        System.out.println("Вариант 3 (иной)");
        System.out.println("----------------------------------");

        System.out.print("Выбираю вариант №: ");
        int variantValue = in.nextInt();

        switch (variantValue){
            case 1:
                System.out.println("----------------------------------");
                System.out.println("Вариант 1 (табличный):");
                System.out.println("Имя: "+ name);
                System.out.println("Город: "+ city);
                System.out.println("Возраст: "+ age);
                System.out.println("Хобби: "+ hobbyUser);
                break;
            case 2:
                System.out.println("----------------------------------");
                System.out.println("Вариант 2 (текстовый):");
                System.out.println("Человек по имени " + name + " живет в городе " + city + ".");
                System.out.println("Этому человеку " + age + " лет и любит он заниматься " + hobbyUser + ".");
                break;
            case 3:
                System.out.println("----------------------------------");
                System.out.println("Вариант 3 (иной):");
                System.out.println(name + " - имя");
                System.out.println(city + " - город");
                System.out.println(age + " - возраст");
                System.out.println(hobbyUser + " - хобби");
                break;
        }

        System.out.println("----------------------------------");

    }
}
