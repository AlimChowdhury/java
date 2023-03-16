class Box
{
    double width;
    double height;
    double depth;

    Box(Box ob)
    {
       width = ob.width;
       height = ob.height;
       depth = ob.depth;
    }

    Box(double w, double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
        return width*height*depth;
    }
}
public class Main {
    public static void main(String[] args)
    {
        double vol;

        Box mybox1 = new Box(10,20,15);
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 : "+vol);

        Box mybox2 = new Box();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 : "+vol);

        Box mycube = new Box(7);
        vol = mycube.volume();
        System.out.println("Volume of mycube : "+vol);

        Box myclone = new Box(mybox1);
        vol = myclone.volume();
        System.out.println("Volume of myclone : "+vol);
    }
}