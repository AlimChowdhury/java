class Test
{
    int a;
    public int b;
    private int c;
    protected int d;

    void setc(int i)
    {
        c=i;
    }

    int getc()
    {
        return c;
    }

}

class Test2
{

}
public class Main {
    public static void main(String[] args)
    {
        Test ob =new Test();

        ob.a=10;
        ob.b=15;
        ///ob.setc()=100 (error!!! as it is private value)
        ob.setc(25);
        ob.d=20;
        System.out.println("a, b, c, d :"+ob.a+" "+ob.b +" "+ob.getc()+" "+ob.d);

        Test2 ob2 = new Test2();
    }
}