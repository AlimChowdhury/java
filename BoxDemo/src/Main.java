class Box{
    double width;
    double height;
    double depth;

    Box()
    {
        System.out.println("Constructing Box.");
        width=10;
        height=10;
        depth=10;
    }
    void volumn()
    {
        System.out.print("Volume is :");
        System.out.println(width*height*depth);
    }

    double volum()
    {
        System.out.print("Volum is :");
        return width*height*depth;
    }

    void setDim(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }

}
public class Main {
    public static void main(String[] args)
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

       // mybox1.width=10;
       // mybox1.height=5;
        //mybox1.depth=2.2;

        mybox1.volumn();
        vol=mybox1.volum();
        System.out.println( vol);

        mybox2.width=10;
        mybox2.height=5;
        mybox2.depth=3;

        mybox2.volumn();

        //set dimension
        mybox1.setDim(10 ,20,15);
        mybox1.volumn();


    }
}