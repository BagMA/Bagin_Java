package packegeProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    private static int number;

    public static void main(String[] args) {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                number = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введено некорректное число");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        if (number > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Число меньше или равно 7");
        }
    }
}
