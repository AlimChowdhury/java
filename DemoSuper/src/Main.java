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
public class Main {
    public static void main(String[] args)
    {
        double vol;

        BoxWeight mybox1 = new BoxWeight(10,20,15,34.4);
        vol= mybox1.volume();
        System.out.println("mybox1 volume is : "+vol);
        System.out.println("mybox1 weight is : "+mybox1.weight);
        System.out.println();

        BoxWeight mybox2 = new BoxWeight();
        vol= mybox2.volume();
        System.out.println("mybox2 volume is : "+vol);
        System.out.println("mybox2 weight is : "+mybox2.weight);
        System.out.println();

        BoxWeight mycube = new BoxWeight(3,2);
        vol= mycube.volume();
        System.out.println("mycube volume is : "+vol);
        System.out.println("mycube weight is : "+mycube.weight);
        System.out.println();

        BoxWeight myclone= new BoxWeight(mybox1);
        vol= myclone.volume();
        System.out.println("myclone volume is : "+vol);
        System.out.println("myclone weight is : "+myclone.weight);
        System.out.println();

    }
}