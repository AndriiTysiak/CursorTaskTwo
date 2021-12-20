package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1. Заповнити масив тільки парними числами
        int[] arrayOne = new int[30];
        for (int i = 0; i < arrayOne.length; i++) {
                arrayOne[i] = i*2;
                System.out.println(arrayOne[i]);

        }
        System.out.println("Масив з парних чисел:\n" + Arrays.toString(arrayOne) + "\n");

        //2. Заповнити масив рандомними числами
        int count = 0;
        Random random = new Random();
        int[] arrayTwo = new int[10];

        for (int i = 0; i < arrayTwo.length; i++) {
            count = random.nextInt(100);
            arrayTwo[i] = count; // это случайными 100
            System.out.println(arrayTwo[i]);
        }
        System.out.println("Масив з рандомних чисел чисел:\n" + Arrays.toString(arrayTwo));
        //3. Вивести середнє значення масиву
        int sum = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            sum += arrayOne[i];
        }
        System.out.println("Середнє значення масиву arrayOne:\n" + sum / arrayOne.length + "\n");
        //Вивести суму всіх значень кратних 3
        int[] arrayThree = new int[10];
        int sumMultipleOfThree = 0;
        System.out.println("Масив чисел arrayThree:");
        for (int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = i;
            System.out.println(arrayThree[i]);
            if (i % 3 == 0) {
                sumMultipleOfThree += i;
            }

        }
        System.out.println("Сума числел кратна трьом:\n" + sumMultipleOfThree);
        //Вивести значення всіх парних індексів масиву

        for (int i = 0; i < arrayThree.length; i += 2) {
            System.out.println("Порядковий номер:  " + i + "\nЗначеняня:  " + arrayThree[i]);

        }
//Просортувати масив в порядку зростанн
        System.out.println("Посортований масив:");
        for (int i = 0; i < arrayTwo.length; i++) {
            int min = arrayTwo[i];
            int min_i = i;
            for (int j = i + 1; j < arrayTwo.length; j++) {
                if (arrayTwo[j] < min) {
                    min = arrayTwo[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arrayTwo[i];
                arrayTwo[i] = arrayTwo[min_i];
                arrayTwo[min_i] = tmp;
            }
            System.out.println(+arrayTwo[i]);
        }
        //Вивести найменше значення в масиві
        int min = arrayTwo[0];
        for (int num : arrayTwo) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Найменше значення маcиву arrayTwo :" + min);
        //Вивести найбільше значення масиву
        int max = arrayTwo[0];
        for (int num : arrayTwo) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Найменше значення маcиву arrayTwo :" + max);
        //Вивести суму значень всіх парних індексів
        int sumOfArray = 0;
        for (int i = 0; i < arrayTwo.length; i += 2) {
            sumOfArray += arrayTwo[i];
        }
        System.out.println("Сума значень парних індексів:" + sumOfArray);
        //Вивести перших 20 символів з таблиці ASCI(від 97)

        char[] arrayAscii = new char[20];
        for (int i = 0; i < arrayAscii.length; i++) {
            arrayAscii[i] = (char) (i + 97);
        }
        System.out.println("Cимволи ASCII(97-116): " + Arrays.toString(arrayAscii));
        //* (завдання з зірочкою)
        //Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними
        int temp;
        int[] arrayRandom = new int[20];
        for (int i = 0; i < arrayRandom.length; i++) {
            count = random.nextInt(100);
            arrayRandom[i] = count;
        }
        System.out.println("Початковий масив: " + Arrays.toString(arrayRandom));
        /* Виникла проблема по суті програми повинно міняти тільки якщо стоїть рядом парний з не парний елементи,
         * в моєму випадку працює не зовсім коректно,якщо рядом два не парні то не міняє ,якщо рядом два парні то все рівно міняє,
         * ну і відповідно коли рядом парний і не парний то також міняє*/

        for (int i = 0; i < arrayRandom.length; i += 2) {
            if (arrayRandom[i] % 2 == 0 ) {
                temp = arrayRandom[i + 1];
                arrayRandom[i + 1] = arrayRandom[i];
                arrayRandom[i] = temp;
            }
        }
        System.out.println("Парні елементи замінені на непарні: " + Arrays.toString(arrayRandom));
    }
}

