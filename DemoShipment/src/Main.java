class Box
{
    private double width;
    private double height;
    private double depth;

    Box(double w,double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box(double len)
    {
        width=height=depth=len;
    }
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }

    double volume()
    {
        return width*height*depth;
    }

}

class BoxWeight extends Box
{
    double weight;

    BoxWeight(BoxWeight ob)
    {
        super(ob);
        weight=ob.weight;
    }
    BoxWeight(double w,double h, double d,double m)
    {
        super(w,h,d);//call super class constructor
        weight=m;
    }

    BoxWeight()
    {
        super();//call super class constructor
        weight=-1;

    }
    BoxWeight(double len, double m) //for cube
    {
        super(len);
        weight=m;
    }
}
class shipment extends BoxWeight
{
    double cost;

    shipment(shipment ob)
    {
        super(ob);
        cost=ob.cost;
    }

    shipment(double w,double h,double d, double m, double c)
    {
        super(w,h,d,m);
        cost=c;
    }
    shipment()
    {
        super();
        cost=-1;
    }
    shipment(double len, double m,double c)
    {
        super(len,m);
        cost=c;

    }
}
public class Main {
    public static void main(String[] args)
    {
        shipment shipment1 = new shipment();
        shipment shipment2 = new shipment(10,20,15,10,3.41);

        double vol;
        vol=shipment1.volume();
        System.out.println("Shipment1 volume is : "+vol);
        System.out.println("Shipment1 weight is : " + shipment1.weight);
        System.out.println("Shipment1 cost is : "+ shipment1.cost);
        System.out.println();

        vol=shipment2.volume();
        System.out.println("Shipment2 volume is : "+vol);
        System.out.println("Shipment2 weight is : " + shipment2.weight);
        System.out.println("Shipment2 cost is : "+ shipment2.cost);
        System.out.println();

    }
}