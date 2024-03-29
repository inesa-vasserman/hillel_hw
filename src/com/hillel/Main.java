package com.hillel;

import java.util.Random;

public class Main {
    public static int[] randomArr = new int[10];
    public static int average = 0;
    public static String lineNumber = "";
    public static String newString = "";
    public static double result;

    public static void main(String[] args) {


        // Вывести ряд чисел от 1 до 100 через пробел, с изменениями
        //- если число кратно 3 то вместо него вывести Hello
        //
        //- если число кратно 5 то вместо него вывести World
        //
        //- если число кратно и 3 и 5 то вместо него вывести HelloWorld


        for (int i = 1; i <= 100; i++) {
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


    }

    // Написать метод который вернет String в которой будут в одну строку числа от 1 до 30. Каждое число при этом взять в круглые скобки ()
    // FIXED

    public static String makeLineNumber() {
        String res = "";
        StringBuilder stringLine = new StringBuilder();
        for (int i = 1; i < 31; i++) {
            stringLine.append("(").append(i).append(")");
        }
        return stringLine.toString();

    }

    // Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.
    // FIXED

    public static double randomizeArray() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randNum = random.nextInt(10 + 1) + 10;
            randomArr[i] = randNum;
            average += randNum;
        }
        result = average / 10.0;

        return result;
    }

    // Написать метод который убирает лишние пробелы в строке и возвращает строку.

    public static String deleteSpace(String str) {
        char[] toCharArray = str.trim().toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            char space = ' ';
            if (toCharArray[i] == space && toCharArray[i + 1] == space) {
                continue;

            } else {
                newString += toCharArray[i];
            }

        }


        return newString;
    }

    // Задан 2-мерный массив char и слово. Написать метод который определит есть ли по вертикали или горизонтали это слово.
    // Например, в данном случае для слова test метод должен вернуть true:
    // Массив загрузить из текстового файла


    public static boolean checkArray(char[][] args, String strTest) {

        char[] stringToArray = strTest.toCharArray();
        int countLine = args.length;
        int countCol = args[0].length;
        int counter = 0;
        for (int i = 0; i < countLine; i++) {
            for (int j = 0; j < countCol; j++) {
                if (args[i][j] == stringToArray[counter]) {
                    counter++;
                    if (counter == stringToArray.length) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        for (int i = 0; i < countCol; i++) {
            for (int j = 0; j < countLine; j++) {
                if (args[j][i] == stringToArray[counter]) {
                    counter++;
                    if (counter == stringToArray.length) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        return false;
    }

}
