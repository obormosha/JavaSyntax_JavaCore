package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int enter = sc.nextInt();
        if (enter < 0)
        {
            System.out.println(enter + 1);
        } else {
            System.out.println(enter*2);
        }

        //напишите тут ваш код

    }

}