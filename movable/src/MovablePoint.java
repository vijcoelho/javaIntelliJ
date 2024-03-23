public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int speed;

    public MovablePoint(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void moveUp() {
        this.y -= this.speed;
    }

    public void moveDown() {
        this.y += this.speed;
    }

    public void moveLeft() {
        this.x -= this.speed;
    }

    public void moveRight() {
        this.x += this.speed;
    }
}
