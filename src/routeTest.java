public class routeTest {
    public static void main (String[] args)
    {
        point[] inPoint = new point[12];
        routes routesMaker = new routes();

        // Входные данные
        inPoint[1] = new point(2,9);
        inPoint[2] = new point(5,9);
        inPoint[3] = new point(8,9);
        inPoint[4] = new point(2,7);
        inPoint[5] = new point(5,7);
        inPoint[6] = new point(8,7);
        inPoint[7] = new point(8,4);
        inPoint[8] = new point(5,4);
        inPoint[9] = new point(9,9);
        inPoint[10] = new point(8,2);
        inPoint[11] = new point(6,2);

        System.out.println("Добрыня и Ко");
        System.out.println("Маршруты для Манхеттена");

        routesMaker.run(inPoint);
    }
}
