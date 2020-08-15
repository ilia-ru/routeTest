// Точка с ее координатами
public class point {
    private int x, y;

    public point(int x, int y) {
        // init
        this.x = x;
        this.y = y;
    }

    public point() {    // Создание "пустой" точки
        // init
        this.x = -1;
        this.y = -1;
    }

    public boolean isNull()  // Точка не создана
    {
        return (this.x == -1);
/*        if(this.x == -1) return true;
        else return false;*/
    }

    public String toString()
    {
        return "(" + Integer.toString(this.x) + "," + Integer.toString(this.y) + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
