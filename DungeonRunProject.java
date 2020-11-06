/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonrunproject;

public class DungeonRunProject {

    public static void main(String[] args) {

        Map w = new Map();  //skapar objekt av klassen map
        w.welcomeMessage();
        w.selectMap(); 
        w.showMap();
        w.choiceOfStartPosition(); 
        w.visitedRoom();
        w.choiceOfDirection();
    }

}
