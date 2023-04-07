class Gen<T>
{
    T ob;

    Gen(T o)
    {
        ob = o;
    }

    T getOb()
    {
        return ob;
    }
    void showType()
    {
        System.out.println("Type of T is " + ob.getClass().getName());
    }

}

class Gen2<T,V>
{
    T ob1;
    V ob2;
    Gen2(T o1, V o2)
    {
        ob1=o1;
        ob2=o2;
    }

    T getOb1()
    {return ob1;}
    V getOb2()
    {
        return ob2;
    }

    void showTypes()
    {
        System.out.println("Type of T is : "+ ob1.getClass().getName())  ;
        System.out.println("Type of V is : " + ob2.getClass().getName())  ;
    }

}
public class Main {
    public static void main(String[] args)
    {
        Gen<Integer> iob;

        iob = new Gen<Integer>(88);
        iob.showType();
        int v =iob.getOb();
        System.out.println("value: "+v);

        System.out.println();

        Gen<String> strOb;

        strOb =new Gen<String>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value : "+ str);

        System.out.println();
        System.out.println();

        Gen2<Integer,String>toObj;
        toObj = new Gen2<>(50,"welcome");
        toObj.showTypes();



    }
}