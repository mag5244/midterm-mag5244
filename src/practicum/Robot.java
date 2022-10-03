/*
Assignment: midterm practicum
Class: Robot
Name: Margaret Gray
Email: mag5244@rit.edu

Description: designs the state and behavior of virtual robots
 */
package practicum;

public class Robot {
    private int ID;
    private int x; //(inc. by 1 when going East or dec. by 1 when going West)
    private int y; //(inc. by 1 when going North or dec. by 1 when going South)
    private Direction direction;

    public void advance(){

    }

    // setters ----------------------------------------------------------------
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // getters ----------------------------------------------------------------
    public int getID() {
        return ID;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    // constructors -----------------------------------------------------------
    /**
     * default constructor
     * @param ID robot's ID
     */
    public Robot(int ID){
        this.ID = ID;
        this.x = 0;
        this.y = 0;
        this.direction = Direction.East;
    }
    /**
     * another constructor
     * @param ID robot's ID
     */
    public Robot(int ID, int x, int y, Direction direction){
        this.ID = ID;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
