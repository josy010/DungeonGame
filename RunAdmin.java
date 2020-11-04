
package dungeonrunproject;

//Getters och setter
public class RunAdmin {
    private int currentX;
    private int currentY;
    private int currentRoom;
    private int startPosition; 
    private int mapChoice; 

    public RunAdmin(int currentX, int currentY, int currentRoom, int startPosition, int mapChoice) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.currentRoom = currentRoom;
        this.startPosition = startPosition;
        this.mapChoice = mapChoice;
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getMapChoice() {
        return mapChoice;
    }

    public void setMapChoice(int mapChoice) {
        this.mapChoice = mapChoice;
    }
    
    
}    

    
