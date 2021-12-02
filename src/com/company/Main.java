package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
       do {
           //BufferedReader inChar = new BufferedReader(new InputStreamReader(System.in));
           Scanner in = new Scanner(System.in);
           System.out.println(" \tZadanie 1A -> 1 ");
           System.out.println(" \tZadanie 1B -> 2 ");
           System.out.println(" \tZadanie 1C -> 3 ");
           System.out.println(" \tZadanie 1D -> 4 ");
           System.out.println(" \tZadanie 1F -> 5 ");

           System.out.print("\nWybierz numer zadania: ");
           int choose = in.nextInt();

           switch (choose) {
               case 1:
                   System.out.println("\n\tZadanie 1A\n");
                   int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                   System.out.println("Przed pętlą: ");
                   System.out.println(Arrays.toString(arr));

                   for (int i = 0; i < arr.length - 1; i++) {

                       if (arr[i] > arr[i + 1]) {
                           int wieksza = arr[i];
                           arr[i] = arr[i + 1];
                           arr[i + 1] = wieksza;
                       }
                   }
                   System.out.println("Po przejściu pętli: ");
                   System.out.println(Arrays.toString(arr));

                   break;
               case 2:
                   System.out.println("\n\tZadanie 1B\n");
                   int licznik = 0;
                   arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

                   System.out.println("Przed pętlą: ");
                   System.out.println(Arrays.toString(arr));


                   for (int i = 0; i < arr.length - 1; i++) {
                       for (int j = 0; j < arr.length - 1; j++) {
                           if (arr[j] > arr[j + 1]) {
                               int wieksza = arr[j];
                               arr[j] = arr[j + 1];
                               arr[j + 1] = wieksza;
                               licznik++;
                           }
                           licznik++;
                       }
                       licznik++;
                   }

                   System.out.println("Po przejściu pętli: ");
                   System.out.println(Arrays.toString(arr));
                   System.out.println("Licznik operacji: " + licznik);
                   break;
               case 3:
                   System.out.println("\n\tZadanie 1C\n");
                   arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                   licznik = 0;

                   System.out.println("Przed pętlą: ");
                   System.out.println(Arrays.toString(arr));


                   for (int i = 1; i < arr.length; i++) {
                       for (int j = 0; j < arr.length - i; j++) {
                           if (arr[j] > arr[j + 1]) {
                               int wieksza = arr[j];
                               arr[j] = arr[j + 1];
                               arr[j + 1] = wieksza;
                               licznik++;
                           }
                           licznik++;
                       }
                       licznik++;
                   }

                   System.out.println("Po przejściu pętli: ");
                   System.out.println(Arrays.toString(arr));
                   System.out.println("Licznik operacji: " + licznik);
                   break;
               case 4:
                   System.out.println("\n\tZadanie 1D\n");
                   arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                   licznik = 0;
                   boolean toSort = true;

                   System.out.println("Przed pętlą: ");
                   System.out.println(Arrays.toString(arr));


                   for (int i = 1; i < arr.length && toSort; i++) {
                       for (int j = 0; j < arr.length - i; j++) {
                           toSort = false;
                           if (arr[j] > arr[j + 1]) {
                               int wieksza = arr[j];
                               arr[j] = arr[j + 1];
                               arr[j + 1] = wieksza;
                               licznik++;
                               toSort = true;
                           }
                           licznik++;
                       }
                       licznik++;
                   }

                   System.out.println("Po przejściu pętli: ");
                   System.out.println(Arrays.toString(arr));
                   System.out.println("Licznik operacji: " + licznik);
                   break;
               case 5:
                   System.out.println("\n\tZadanie 1F\n");
                   arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
                   licznik = 0;
                   toSort = true;

                   Arrays.sort(arr);

                   System.out.println("Przed pętlą: ");
                   System.out.println(Arrays.toString(arr));


                   for (int i = 1; i < arr.length && toSort; i++) {
                       for (int j = 0; j < arr.length - i; j++) {
                           toSort = false;
                           if (arr[j] > arr[j + 1]) {
                               int wieksza = arr[j];
                               arr[j] = arr[j + 1];
                               arr[j + 1] = wieksza;
                               licznik++;
                               toSort = true;
                           }
                           licznik++;
                       }
                       licznik++;
                   }

                   System.out.println("Po przejściu pętli: ");
                   System.out.println(Arrays.toString(arr));
                   System.out.println("Licznik operacji: " + licznik);
                   break;

           }

        System.in.read();
       }while(true);



    }

}
