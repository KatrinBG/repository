package ru.kate.home.lessons.homework2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String familyName = "";
        String firstName = "";
        String patrName = "";
        int age = 0;
        String familyNamePattern = "/^([А-ЯA-Z]|[А-ЯA-Z][\\x27а-яa-z]{1,30}|[А-ЯA-Z][\\x27а-яa-z]{1,30}-([А-ЯA-Z][\\x27а-яa-z]{1,30}|(оглы)|(кызы)))?$/";
        String firstNamePattern = "/^[А-ЯA-Z][\\x27а-яa-z]{1,30}?$/";
        String patrNamePattern = "/^([А-ЯA-Z][\\x27а-яa-z]{1,30})?$/";


        Scanner in = new Scanner(System.in);

//        while (true) {
//            System.out.println("Введите фамилию: ");
//            if (in.next().trim().matches(familyNamePattern)) {
//                familyName = in.next();
//                break;
//            }
//        }
        System.out.println("Введите Фамилию: ");
        if (in.hasNext()) {
            familyName = in.next();
        } else {
            return;
        }
        System.out.println("Введите имя: ");
        if (in.hasNext()) {
            firstName = in.next();
        } else {
            return;
        }
        System.out.println("Введите отчество: ");
        if (in.hasNext()) {
            patrName = in.next();
        } else {
            return;
        }
        System.out.println("Введите возрвст: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
        } else {
            return;
        }
        in.close();
        writeToFile(familyName, firstName, patrName, age);
    }

    public static void writeToFile(String familyName, String firstName, String patrName, int age) {
        String fileString = familyName + " " + firstName + " " + patrName;
        File file = new File(firstName);
        BufferedWriter bw = null;

        try {
            FileWriter writer = new FileWriter(file, true);
            bw = new BufferedWriter(writer);
            bw.write(fileString + " " + age);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {

            }
        }
    }
}
