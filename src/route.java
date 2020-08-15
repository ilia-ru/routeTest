// Маршрут - 4 точки (в задаче - прямоугольник)
public class route {
    private point lt, rt, lb, rb; // вершины прямоугольника

    public route(point lt, point rt, point lb, point rb) {
        // init
        this.lt = lt;
        this.rt = rt;
        this.lb = lb;
        this.rb = rb;
    }
    public route(point lt, point rt) {  // Создаем неполный маршрут из 2 точек для 1 цикла
        // init
        this.lt = lt;
        this.rt = rt;
        this.lb = new point();
        this.rb = new point();
    }

    public String toString()
    {
        return "Маршрут (x,y) " + this.lt.toString() + " - " + this.rt.toString() + " - " +
                    this.lb.toString() + " - " + this.rb.toString();
    }

    public point getLt() {
        return lt;
    }

    public void setLt(point lt) {
        this.lt = lt;
    }

    public void setLt(int x, int y) {
        this.lt = lt;
    }

    public point getRt() {
        return rt;
    }

    public void setRt(point rt) {
        this.rt = rt;
    }

    public point getLb() {
        return lb;
    }

    public void setLb(point lb) {
        this.lb = lb;
    }

    public point getRb() {
        return rb;
    }

    public void setRb(point rb) {
        this.rb = rb;
    }
}

