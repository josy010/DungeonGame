/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonrunproject;

public class DungeonRunProject {

    public static void main(String[] args) {

        RunAdmin move = new RunAdmin(0, 0, 0, 0, 0);
        int[][] mapSmall = new int[4][4];
        Map w = new Map();  //skapar objekt av klassen map
        w.welcomeMessage();
        w.showMap();
      
        //w.pictureMap();
        //w.pictureMap2();
        //w.showMapSize();
        w.mapSmall();
        w.choiceOfDirection();
        //w.map2();

        w.visitedRoom();
        //w.playerMovement(move, mapSmall);
    }

}
