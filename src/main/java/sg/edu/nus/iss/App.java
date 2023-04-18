package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MountainBike mountainBike= new MountainBike(5, 10, 20);
        //System.out.println(mountainBike.toString());
        MountainBike mountainBike2= new MountainBike(22, 30, 80);
        MountainBike mountainBike3= new MountainBike(10, 10, 2);

        RoadBike roadBike = new RoadBike(8, 22, 44);
        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(mountainBike);
        bicycles.add(mountainBike2);
        bicycles.add(mountainBike3);
        bicycles.add(roadBike);
        for(int i=0; i<bicycles.size(); i++)
        {
            System.out.println(bicycles.get(i));
        }

        // for(MountainBike mb: bicycles)
        // {
        //     System.out.println(mb.toString());
        // }

        for(Bicycle bicycle: bicycles)
        {
            if(bicycle instanceof MountainBike)
            {
                System.out.println(bicycle.hashCode()+" is a Mountain Bike");
            } else if (bicycle instanceof RoadBike)
            {
                System.out.println(bicycle.hashCode()+" is a Road Bike");
            }
        }

    }

}
