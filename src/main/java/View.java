//#### 4. Класс `View`
//        Создать класс `View` для взаимодействия с пользователем:
//        - `int getValue(String title)`: метод для получения значения от пользователя.
//        - `void print(int data, String title)`: метод для вывода результата на экран.

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int getValue(String title) {
        int value = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(title + ": ");
            try {
                value = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        return value;
    }


    public void print(int data, String title) {
        System.out.println(title + ": " + data);
    }
}

