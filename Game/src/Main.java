class Enemy
{
    int health;
    int attack_power;

    Enemy()
    {
        health=-1;
        attack_power=-1;
    }
    Enemy(int h, int ap)
    {
        health=h;
        attack_power=ap;
    }

    void show()
    {
        System.out.println("health is : "+health+"  and attack power is : "+ attack_power);
    }
}

class Fly extends Enemy
{
    Fly(int hf, int apf)
    {
        super(hf,apf);
    }

}

class Shoot extends Enemy
{
    Shoot(int hs, int aps)
    {
        super(hs,aps);
    }
}
public class Main {
    public static void main(String[] args)
    {
        System.out.println("...Start...");

        Fly Dragon = new Fly(100,400);
        System.out.print("Dragon's ");
        Dragon.show();

        Shoot Wizard = new Shoot(300,200);
        System.out.print("Wizard's ");
        Wizard.show();


    }
}