import java.util.ArrayList;

public class routes
{
//    private route[] tmpRoutes;  // временный массив для формирования маршрутов
    private ArrayList<route> tmpRoutes = new ArrayList<route>();
    private int i,j;
    private int currentX, currentY;
//    point nPoint = new point(-1, -1);  // NULL для точки


    public void run(point[] inPoint)
    {
        for(i=1; i<inPoint.length; i++)  // по LT
        {
            currentY = inPoint[i].getY();
            currentX = inPoint[i].getX();
            for (j = 1; j < inPoint.length; j++)  // по RT
            {
                if ((inPoint[j].getY() == currentY) && (inPoint[j].getX() > currentX))
                {
                    tmpRoutes.add(new route(inPoint[i], inPoint[j]));
                }

            }
        }
        i=1;
        for(route r : tmpRoutes)
        {
            System.out.println(i + " " + r.toString());
            i++;
        }
    }
}
