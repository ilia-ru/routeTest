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
        // Step 1. Формируем массив маршрутов, добавляем - LT & RT
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
        if(tmpRoutes.stream().count() <=0)  // нет горизонталей
        {
            System.out.println("Невозможно построить маршруты - нет горизонталей");
            return;
        }

        // Step. 2. Ищем LB. Перебираем массив маршрутов построчно.
        // Для каждой LT подбираем LB, чтобы LT.x == LB.x и LB.y < LT.y
        route tmp;
        i=0;
        int numOftmpRoutes = tmpRoutes.size();
        while(i < numOftmpRoutes)  // по маршрутам, созданным выше (кроме добавляемых здесь)
        {
//            currentY = inPoint[i].getY();
//            currentX = inPoint[i].getX();
            tmp = null;
            for (j = 1; j < inPoint.length; j++)  // по входным данным
            {
                if ((tmpRoutes.get(i).getLt().getX() == inPoint[j].getX())
                        && (inPoint[j].getY() < tmpRoutes.get(i).getLt().getY()))
                {
                    if(tmp == null)
                    {// дополняем LB в текущую строку
                        tmp = tmpRoutes.get(i);
                        tmp.setLb(inPoint[j]);
                    }
                    else {   // добавляем новую строку - новый вариант маршрута и в нее LB
                        tmp = tmpRoutes.get(i);
                        tmpRoutes.add(new route(tmp.getLt(), tmp.getRt(), inPoint[j], tmp.getRb()));
                   }
                }
            }
            i++;
            // Удаляем строки для которых не нашлось LB
           // tmpRoutes.remove(i);

        }
        // Выводим результат
        i=1;
        for(route r : tmpRoutes)
        {
            System.out.println(i + " " + r.toString());
            i++;
        }
    }
}
