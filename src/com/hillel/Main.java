package com.hillel;


public class Main {

    public static void main(String[] args) {
        int[] random_arr = new int[10];
        float avarage = 0;

        // Вывести ряд чисел от 1 до 100 через пробел, с изменениями
        //- если число кратно 3 то вместо него вывести Hello
        //
        //- если число кратно 5 то вместо него вывести World
        //
        //- если число кратно и 3 и 5 то вместо него вывести HelloWorld


	for(int i=1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 != 0) {
            System.out.print("Hello ");
        } else if (i % 3 != 0 && i % 5 == 0) {
            System.out.print("World ");
        } else if (i % 3 == 0 && i % 5 == 0) {
            System.out.print("HelloWorld ");
        } else {
            System.out.print(i + " ");
        }
        }

    System.out.println();

    // Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.

    for (int i = 0; i < 10; i++) {
        int rand_num = (int)((Math.random() * (20 - 10 + 1)) + 10);
        random_arr[i] = rand_num;
        avarage += rand_num;
        System.out.print(random_arr[i] + " ");
    }
    System.out.println(avarage / 10);

//        char Arr[][] = {{ 't', 'e', 's', 't',}, {'k', 'e', 's', 'e'}, {'e', 'm', 'k', 's'}, {'s','s', 's', 't'}, {'t', 'e', 's', 'k'}};
//    boolean bool = check_arr(Arr, "test");
//    System.out.print(bool);
    }

    // Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()

    public static String line_number() {
        String a = "";
        for (int i = 1; i <= 30; i++) {
            a += "(" + i + ")";
        }
        return a;

    }

    // Написать метод который убирает лишние пробелы в строке и возвращает строку.

    public static String delete_space(String str) {
        String new_str = "";

        char[] str_to_arr = str.trim().toCharArray();
        for (int i = 0; i < str_to_arr.length; i++) {
            char space = ' ';
            if (str_to_arr[i] == space && str_to_arr[i + 1] == space) {
                continue;

            } else {
                new_str += str_to_arr[i];
            }

        }

        System.out.println(new_str);

        return new_str;
    }

    // Задан 2-мерный массив char и слово. Написать метод который определит есть ли по вертикали или горизонтали это слово.
    // Например, в данном случае для слова test метод должен вернуть true:
    // Массив загрузить из текстового файла

    public static boolean check_arr(char[][] args, String str_test) {

        char[] ch=str_test.toCharArray();
        int nums = args.length;
        int col = args[0].length;
        int k = 0;
        for (int i = 0; i < nums; i++) {
            for (int j = 0; j < col; j++) {
                if (args[i][j] == ch[k]) {
                    k++;
                    if (k == ch.length) {
                        return true;
                    }
                } else {
                    k = 0;
                }
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < nums; j++) {
                if (args[j][i] == ch[k]) {
                    k++;
                    if (k == ch.length) {
                        return true;
                    }
                } else {
                    k = 0;
                }
            }
        }

        return false;
    }

}
