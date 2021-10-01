import java.util.Scanner;

public class TwoDementionalArrayExample

{

      static Scanner scan = new  Scanner(System.in);

      public static void main(String[] args)

      {

            int rowNumber,

            columnNumber;

            String choice = "yes";

            System.out.println("This program fills and prints a two-dimensional array.");

            while(choice.equalsIgnoreCase("yes"))

            {

                  System.out.println("Please enter the number of rows you would like.");

                  rowNumber = scan.nextInt();

                  System.out.println("Please enter the number of columns you would like.");

                  columnNumber = scan.nextInt();

                  int[][] array = new int[rowNumber][columnNumber];

                  readArray(array,rowNumber,columnNumber);

                  printArray(array, rowNumber, columnNumber);

                  System.out.println("          Would you like to create a new array?");

                  System.out.println("          Please choose yes/no");

                  scan.nextLine();//enter key

                  choice = scan.nextLine();

            }

      }

      private static void readArray(int[][] array, int rowNumber, int columnNumber)

      {

            //*** these two for loops fill the array

            int move = 1;

            for(int k = 0; k < rowNumber; k++)

            {

                  for(int j = 0; j < columnNumber; j++)

                  {

                        array[k][j]  = move;

                        move++;

                  }

            }

      }

      private static void printArray(int[][] array, int rowNumber, int columnNumber)

      {

            int move;

            for(int k = 0; k < rowNumber; k++)

            {

                  for(int j = 0; j < columnNumber; j++)

                  {

                        move =array[k][j];

                        if(move < 10)

                              System.out.print(  " ");

                        System.out.print( move + " ");

                        move++;

                  }

                  System.out.println();

            }

      }

}