package PracticeExeptionsHT;

import java.io.*;

public class task9 {
    public static String[] phonebook = new String[5];

    public static void main(String[] args) throws IOException {

        String action;// действие
        loadBase(); //
        showPhoneBook();
        //вывод на екран описания возможных действий с указанием команд
        System.out.println("Пропишите команду указанную внутри  < > для действия: ( <add>  - добавить данные," +
                " <show> - демонстрирует данные, " +
                " <del>  - удалить данные," +
                " <exit> - выход! ");
        // считывает текст из символьного потока ввода, буферизируя прочитанные символы.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        action = bf.readLine();


        // сценарий выбора команд

        while (!action.equals("exit")) {
            //добавление записи
            if (action.equals("add")) {
                System.out.println("Ввод фамилии, имени, отчества.");
                      System.out.println("Укажите вашу  фамилию:");
                String first_name = bf.readLine();
                      System.out.println("Укажите ваше имя:");
                String second_name = bf.readLine();
                      System.out.println("Укажите ваше отчество:");
                String Third_name = bf.readLine();
                      System.out.println("Укажите вашу дату рождения (день.месяц.год):");
                String birthdate = bf.readLine();
                      System.out.println("Укажите ваш телефон:");
                String phone = bf.readLine();
                      System.out.println("Укажите ваш пол (м/ж):");
                String sex = bf.readLine();
                      addAllBio(first_name, second_name, Third_name, birthdate, phone, sex);
            } else {

                if (action.equals("del")) {
                    for (int i = 0; i < phonebook.length; i++) {
                        phonebook[i] = ""; // удаление
                    }
                } else {
                    if (action.equals("show")) {
                        showPhoneBook(); // демонстрация
                    }
                }
            }
            System.out.println("Пропишите команду указанную внутри  < > для действия: ( <add>  - добавить данные," +
                    " <show> - демонстрирует данные, " +
                    " <del>  - удалить данные," +
                    " <exit> - выход! ");
            action = bf.readLine(); // след.действие
        }
    }

    public static void loadBase() throws IOException {
        File file = new File("biolist.txt");
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(new File("biolist.txt")));
            String action;
            while ((action = reader.readLine()) != null) {
                String nothing = " ";
                phonebook[0] = nothing;
                phonebook[1] = nothing;
                phonebook[2] = nothing;
                phonebook[3] = nothing;
                phonebook[4] = nothing;
                phonebook[5] = nothing;
            }
            reader.close();
        }
    }

    //ShowPhoneBook - выводит на екран все записи
    public static void showPhoneBook() {
        System.out.println("Указанные данные: ");
        for (int i = 0; i < phonebook.length; i++) {
            System.out.println(phonebook[i]);
        }
    }


    private static void addAllBio(String first_name,
                                  String second_name,
                                  String third_name,
                                  String birthdate,
                                  String phonenum,
                                  String sex) {
        phonebook[0] = first_name;
        phonebook[1] = second_name;
        phonebook[2] = third_name;
        phonebook[3] = birthdate;
        phonebook[4] = phonenum;
        phonebook[5] = sex;
    }
}

