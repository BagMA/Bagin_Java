package packegeProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task3 {
    public static int[] array;
    private static ArrayList<Integer> listNumbDivisByThree;
    private static ArrayList<Integer> divisibleByThree(int[] array){
        listNumbDivisByThree = new ArrayList<>();
        for (int num: array) {
            if (num % 3 == 0){
                listNumbDivisByThree.add(num);
            }
        }
        return listNumbDivisByThree;
    }

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Выберете длину массива, введите число:");
            int lengthArray = Integer.parseInt(reader.readLine());
            array = new int[lengthArray];
            System.out.println("Введите " + array.length + " целых чисел");
            for (int i = 0; i < array.length; i++) {
               int num = Integer.parseInt(reader.readLine());
                array[i] = num;
            }
            divisibleByThree(array);
            System.out.println(listNumbDivisByThree);
        } catch (NumberFormatException e) {
            System.out.println("Введено некорректное число, попробуйте еще раз");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
