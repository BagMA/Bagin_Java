package packegeProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {
    private static final String NAME = "Вячеслав";
    private static String inputName;
    private static void equalityCheck(){
        if (NAME.equals(inputName)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            inputName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("Вероятно Вы ввели недопустимый формат данных");
        }
        equalityCheck();
    }
}
