package Homework;

import javax.swing.*;

public class ArrayUtil {
    public static void main(String[] args) {
        int array[] = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        // տպել մասիվի բոլոր էլեմենտները

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();


        // տպել մասիվի ամենամեծ թիվը

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("max = " + max);


        // տպել մասիվի ամենափոքր թիվը

        int min = array[0];
        for (int i = 0; i > array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);


        System.out.println("զույգերը");
        // տպել մասիվի բոլոր զույգ էլեմենտները

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        System.out.println("կենտեր");
        // տպել մասիվի բոլոր կենտ էլեմենտները

        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 !=0) {
                System.out.println(array[i]);
            }
        }

              // տպել մասիվի բոլոր զույգ էլեմենտները քանակը
              int evencount=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evencount ++;

            }
        }
        System.out.println("evencount " +  evencount);

        // տպել մասիվի բոլոր  կենտ էլեմենտները քանակը
        int oddcount=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddcount ++;

            }
        }
        System.out.println("oddcount " +  oddcount);


        //տպել մասիվի բոլոր թվերի միջին թվաբանականը


        int i;
        int result = 0;
        for (i = 0; i < 10; i++) {
            result = result + array[i];
        }
        System.out.println("Average is " + result / 10);


        // բոլոր էլեմենտների գումարը

        int sum = 0;
        for (int j = 0; j < 10; j++) {
            sum += array[j];
        }
        System.out.println(+sum);


    }
}
