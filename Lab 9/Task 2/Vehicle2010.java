public class Vehicle2010 extends Vehicle {
    public Vehicle2010() {
        super.moveUp();
        super.moveDown();
        super.moveLeft();
        super.moveRight();
    }

    public void moveUpperRight() {
        this.x += 1;
        this.y += 1;
    }

    public void moveLowerRight() {
        this.x += 1;
        this.y -= 1;
    }

    public void moveLowerLeft() {
        this.x -= 1;
        this.y -= 1;
    }
}