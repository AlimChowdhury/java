class A
{
    int i,j;


    void showij(){
        System.out.println("i and j : "+i+" "+j);
    }
}
class B extends A
{
    int k;


    void showk()
    {
        System.out.println("k : "+k);
    }

    void sum()
    {
        System.out.println("i+j+k : "+(i+j+k));
    }
}
public class Main {
    public static void main(String[] args)
    {
        //super
        A superob = new A();
        B subob = new B();

        superob.i=10;
        superob.j=15;
        superob.showij();

        //sub
        subob.i=7;
        subob.j=8;
        subob.k=9;

        subob.showij();
        subob.showk();
        subob.sum();
    }


}