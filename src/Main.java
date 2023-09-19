import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker password = new PasswordChecker();
        System.out.print("Введите мин. длину пароля:");
        String input = scanner.nextLine();
        password.setMinLength(Integer.parseInt(input));
        System.out.print("Введите макс. допустимое количество повторений символа подряд:");
        input = scanner.nextLine();
        password.setMaxRepeats(Integer.parseInt(input));
        while (true){
             System.out.print("Введите пароль или end:");
             input = scanner.nextLine();
             if (input.equals("end")){System.out.print("Программа завершена"); break;}
             password.verify(input);
        }


    }
}