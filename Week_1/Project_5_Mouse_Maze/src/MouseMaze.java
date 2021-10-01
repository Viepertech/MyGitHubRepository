/**Project_5_Mouse_Maze, A mouse goes from the top
 * left of an array with given rows and columns by a user
 * the mouse will then navigate via random numbers towards to the bottom
 * right corner, a cat is there and if the mouse moves onto the cat
 * the mouse is eaten and the process is repeated, it is also repeated
 * if the mouse moves off the board and thus dies.  it also records if mouse
 * went backwards and if there was a repeat of a previous move.
 * Prints out the given array with a path showing what the mouse took.
 */
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MouseMaze
{
    private static final Scanner sc = new Scanner(System.in);
    private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

//introductions, asking questions.
//I could easily add a few lines of code to execute
//and stop running the program, but looking at the output desired I removed it.
    public static void main(String[] args)
    {
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        
        int rowNumber, columnNumber;
        String choice = "repeat";
        System.out.println("This program finds a path for a mouse from one corner to another.");
        System.out.println("in a two dimensional maze.");
        while(choice.equalsIgnoreCase("repeat")) {
            System.out.println("How many rows would you like?");
            rowNumber = sc.nextInt();
            System.out.println("How many columbs would you like?");
            columnNumber = sc.nextInt();
            performMaze(rowNumber, columnNumber);
        }
    }
    
    private static void performMaze(int rowNumber, int columnNumber)
    {
        //maze will be maintained so that it can be displayed afterwards
        int maze[][] = new int[rowNumber][columnNumber];
        //mouseVisitedPosition will contain the details of previous moves in every attempt
        int mouseVisitedPosition[][] = new int[rowNumber][columnNumber];
        //variables to store mouse info
        int mouseRow = 0, mouseColumn = 0, mouseMove = 0;
        //variable to store cat info
        int catRow = 0, catColumn = 0;
        //Variables set to zero, will increase by 1 if condition is met while in loop
        int attemptCount = 0;
        int fallOffMazeCount = 0, goBackwardsCount = 0, landOnPreviousMoveCount = 0, killedByCatCount = 0;

        //boolean to check when to stop performing the operations
        boolean mazeCompleted = false;

        //This loop will continue until a successful move is made
        while (!mazeCompleted)
        {
            attemptCount ++;
            mouseRow = 0;
            mouseColumn = 0;
            mouseMove = 1;
            maze = new int[rowNumber][columnNumber];
            mouseVisitedPosition = new int[rowNumber][columnNumber];

            //The first move at 0,0 or the top left corner
            maze[0][0] = 1;
            mouseVisitedPosition[0][0] = 2; // 2 means visited

            //Checking if mouse is indeed alive
            boolean isMouseAlive = true;

            //This loop will be responsible for every move in each attempt
            while(isMouseAlive && !mazeCompleted)
            {
                //Choose a random number to figure mouse move
                Random random = new Random();
                int randomMoveChooser = random.nextInt(8) + 1;
                //The function generates random between 0 - bound-1 (both inclusive)

                int newMouseRow = 0;
                int newMouseColumn = 0;

                //Using a variable between 1 and 8, determines direction in a 2D plane
                switch (randomMoveChooser)
                {
                //case 1 is going top left
                    case 1 : 
                    {
                        newMouseRow = mouseRow - 1;
                        newMouseColumn = mouseColumn - 1;
                        break;
                    }
                //case 2 is going straight up
                    case 2 : 
                    {
                        newMouseRow = mouseRow - 1;
                        newMouseColumn = mouseColumn;
                        break;
                    }
               //case 3 going top right
                    case 3 : 
                    {
                        newMouseRow = mouseRow - 1;
                        newMouseColumn = mouseColumn + 1;
                        break;
                    }
               //case 4 is going right
                    case 4 : 
                    {
                        newMouseRow = mouseRow ;
                        newMouseColumn = mouseColumn + 1;
                        break;
                    }
               //case 5 going bottom right
                    case 5 : 
                    {
                        newMouseRow = mouseRow + 1;
                        newMouseColumn = mouseColumn + 1;
                        break;
                    }
               //case 6 is going bottom
                    case 6 : 
                    {
                        newMouseRow = mouseRow + 1;
                        newMouseColumn = mouseColumn;
                        break;
                    }
               //case 7 is going bottom left
                    case 7 : {
                        newMouseRow = mouseRow + 1;
                        newMouseColumn = mouseColumn - 1;
                        break;
                    }
              //case 8 going straight left
                    case 8 : 
                    {
                        newMouseRow = mouseRow;
                        newMouseColumn = mouseColumn - 1;
                        break;
                    }
                }

                
                //Cat is a big boi taking a 2x2 space on the array
                catRow = random.nextInt(rowNumber-1);
                catColumn = random.nextInt(columnNumber -1);

                if( (newMouseRow<0) || (newMouseRow>=rowNumber) || (newMouseColumn<0) || (newMouseColumn>=columnNumber))
                {
                    //mouse has fallen off edge and becomes DEAD, increase fallOffMazeCount by 1
                    fallOffMazeCount++;
                    isMouseAlive = false;
                }
                else if(mouseVisitedPosition[newMouseRow][newMouseColumn] == 2)
                {
                    //Mouse has landed on a previous move, increases landOnPreviousMoveCount by 1
                    landOnPreviousMoveCount++;
                    isMouseAlive = false;
                }
                else if((newMouseColumn+newMouseRow) < (mouseColumn+mouseRow) )
                {
                    //Has Moved Backwards, increases goBackwardsCount by 1
                    goBackwardsCount++;
                    isMouseAlive = false;
                }
                else if((catRow==newMouseRow && catColumn==newMouseColumn) ||
                        (catRow+1==newMouseRow && catColumn==newMouseColumn) ||
                        (catRow==newMouseRow && catColumn+1==newMouseColumn) ||
                        (catRow+1==newMouseRow && catColumn+1==newMouseColumn))
                {
                    //Cat has got the mouse, increase the Cat Kill Count by 1
                    killedByCatCount++;
                    isMouseAlive = false;
                }
                else
                {
                    //the move is legal and the mouse gets to live to make a new move
                    mouseColumn = newMouseColumn;
                    mouseRow = newMouseRow;
                    mouseMove++;
                    maze[mouseRow][mouseColumn] = mouseMove;
                    mouseVisitedPosition[mouseRow][mouseColumn] = 2;

                    //if mouse has reached the final block
                    //It completes the maze and it is done.
                    if(mouseRow == rowNumber-1 && mouseColumn == columnNumber-1)
                    {
                        mazeCompleted = true;
                    }

                }

            }

        }

        //Setting last position of cat
        //If at the cat position, a move was not played, only then display cat at that point

        if(maze[catRow][catColumn] == 0)
            maze[catRow][catColumn] = -1;
        if(maze[catRow+1][catColumn] == 0)
            maze[catRow+1][catColumn] = -1;
        if(maze[catRow][catColumn+1] == 0)
            maze[catRow][catColumn+1] = -1;
        if(maze[catRow+1][catColumn+1] == 0)
            maze[catRow+1][catColumn+1] = -1;


        //Printing the Output of the info.

        System.out.println("It took "+decimalFormat.format(attemptCount)+" attempts to find a path.");
        
        System.out.println("The cat got the mouse "+decimalFormat.format(killedByCatCount)+" times.");
        
        System.out.println("The mouse fell off the maze "+decimalFormat.format(fallOffMazeCount)+" times.");
        
        System.out.println("The mouse went backwards "+decimalFormat.format(goBackwardsCount)+" times.");
        
        System.out.println("The mouse went to a former move "+decimalFormat.format(landOnPreviousMoveCount)+" times.");
// prints out the maze
        System.out.println();
        for(int i = 0; i < rowNumber; i++)
        {
            for(int j = 0; j < columnNumber; j++)
            {
                int k = maze[i][j];
                if(k == -1)
                    System.out.print("  C ");
                else if(k < 10)
                    System.out.print("  "+k+" ");
                else
                    System.out.print(" "+k+" ");
            }
            System.out.println();
        }
        System.out.println();

    }

}