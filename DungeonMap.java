package dungeonrunproject;

import java.util.*;

public class DungeonMap {

    Scanner input = new Scanner(System.in);
    int mapChoice;
    boolean isInt = true;
    int position = 0;
    //direction++;
    int[][] mapSmall = new int[4][4];
    boolean northDirection = false;
    boolean southDirection = false;
    boolean westDirection = false;
    boolean eastDirection = false;
    int direction;

    public void welcomeMessage() {
        System.out.println("        .:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:.");
        System.out.println();
        System.out.println("           _.--\"\"\"\"\"--._");
        System.out.println("           /                \\         WELCOME TO THE MAP ");
        System.out.println("          ;                   ;       ******************");
        System.out.println("          |                   |      (  )");
        System.out.println("          |                   |     ( ) ");
        System.out.println("          ;                   ;   ( )");
        System.out.println("          \\ (`'--,    ,--'`) / ()");
        System.out.println("          \\ \\  _ )  ( _  / /");
        System.out.println("           ) )(')/    \\(')( (");
        System.out.println("          (_ `\"\"` /\\  `\"\"´ _)");
        System.out.println("           \\`\"-, /  \\ ,-\"`/");
        System.out.println("            \\ //  `\"\"` \\ //`");
        System.out.println("             |/\\/\\/\\/\\/\\/|");
        System.out.println("              |\\       //|");
        System.out.println("              ;||/\\/\\/\\||");
        System.out.println("               \\`-`--`-`/");
        System.out.println("                \\      /");
        System.out.println("                 ',__,'");
        System.out.println("                  q__p");
        System.out.println("                  q__p");
        System.out.println("                  q__p");
        System.out.println("                  q__p");
        System.out.println();

        System.out.println("  _^__                                                               __^__");
        System.out.println("( ___ )-------------------------------------------------------------( ___ )");
        System.out.println(" | / |            The adventure will follow a map                    | \\ |");
        System.out.println(" | / |    In each room of the map something may occur,               | \\ |");
        System.out.println(" | / |       either one or more monster will appaer,                 | \\ |");
        System.out.println(" | / |          and/or treasure(s) will be found.                    | \\ |");
        System.out.println(" | / |    This is random, no one knows what will happen.             | \\ |");
        System.out.println(" | / |     When you have won all fights and visited all rooms        | \\ |");
        System.out.println(" | / |  the game is at end. The game also ends if you get defeated   | \\ |");
        System.out.println(" |___|       You will also have the choice to leave the map.         |___|");
        System.out.println("(_____)-------------------------------------------------------------(_____)");
        System.out.println();
   
    }

    public int showMap() {
        System.out.println("You can choose between the following adventures: ");
        System.out.println("1) Map small");
        System.out.println("2) Map medium");
        System.out.println("3) Map large");
        System.out.println();
        System.out.println("Your choice: ");
  
        while (true) {
         
            try {
                mapChoice = input.nextInt();
                if (mapChoice < 1 || mapChoice > 3) {
                    System.out.println("Not correct, please enter a value between 1 - 3");
                    continue;
                }
            } catch (Exception e) {
                input.next();
                System.out.println("Oopsie a daisy! Try again!");
                continue;
            }
            return mapChoice;
        }
    }

    public int choiceOfStartPosition() {
        while (true) {
            System.out.println("\nPlease choice which corner you'll like to start at. ");
            System.out.println("NorthWest=1, NorthEast=4, SouthWest=13, SoutEast=16");
            position = input.nextInt();
            if (position == 1) {
                System.out.println("You chose to start in the northwest");
                return position;
            } else if (position == 4) {
                System.out.println("You chose to start in the northeast");
            } else if (position == 13) {
                System.out.println("You chose to start in the southwest");
            } else if (position == 16) {
                System.out.println("You chose to start in the southeast");

            } else {
                System.out.println("Wrong input");
            }
        }
    }

    public void choiceOfDirection() {
        boolean isRunning = true;
        int x = 0;
        int y = 0;
        int choice;

        // while(isRunning){
        // System.out.println("From your current position you may choose the following options");
        System.out.println("Give me a position");
        position = input.nextInt();
        input.nextLine();

        if ((position == 6) && (position == 7) && (position == 10) && (position == 11)) {
            System.out.println("North:1, South:2, East:3 or West:4");
        }
        if ((position == 2) && (position == 3)) {
            System.out.println("South:2, East:3 or West:4");
        }
        if ((position == 14) && (position == 15)) {
            System.out.println("North:1, East:3 or West:4");

        }
        if ((position == 5) && (position == 9)) {
            System.out.println("North:1, South:2 or East:3");

        }
        if ((position == 8) && (position == 12)) {
            System.out.println("North:1, South:2 or West:4");

        }
        if (position == 1) {
            System.out.println("South:2 or East:3");

        }
        if (position == 4) {
            System.out.println("South:2 or West:4");

        }
        if (position == 13) {
            System.out.println("North:1 or East:3");

        }
        if (position == 16) {
            System.out.println("North:1 or West:4");

        }
        System.out.println("Please make your choice");
        choice = input.nextInt();
        input.nextLine();
    }

    public void mapSmall() {
        // int[][] mapSmall = new int[4][4];

        mapSmall[0][0] = 1;
        mapSmall[0][1] = 2;
        mapSmall[0][2] = 3;
        mapSmall[0][3] = 4;

        mapSmall[1][0] = 5;
        mapSmall[1][1] = 6;
        mapSmall[1][2] = 7;
        mapSmall[1][3] = 8;

        mapSmall[2][0] = 9;
        mapSmall[2][1] = 10;
        mapSmall[2][2] = 11;
        mapSmall[2][3] = 12;

        mapSmall[3][0] = 13;
        mapSmall[3][1] = 14;
        mapSmall[3][2] = 15;
        mapSmall[3][3] = 16;

        int rows = 4;
        int columns = 4;
        int i, j;

        for (i = 0; i < rows; i++) {
            //bara snygga grejer för utskrift
            System.out.println("------------------");
            //den inre for-loopen kolumnerna
            for (j = 0; j < columns; j++) {
                System.out.print(mapSmall[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
    }

    public void visitedRoom() {
        for (int k = 0; k < mapSmall.length; k++) {
            for (int l = 0; l < mapSmall.length; l++) {

                if (mapSmall[k][l] == position) {
                    mapSmall[k][l] = 0;
                    System.out.println("fortsätt spelet " + mapSmall[k][l]); //kolla så det stämmer printout
                }
            }
        }

        int rows = 4;
        int columns = 4;
        int i, j;

        for (i = 0; i < rows; i++) {
            //bara snygga grejer för utskrift
            System.out.println("------------------");
            //den inre for-loopen kolumnerna
            for (j = 0; j < columns; j++) {
                System.out.print(mapSmall[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("------------------");

    }
  
}
