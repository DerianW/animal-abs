package animals;

public class Main
{
    public static void main(String[] args)
    {
        Animal fl00fie = new Dog() ;
        RoboDog klankzerrz = new RoboDog() ;

        System.out.println(((Dog) fl00fie).greet()) ;
        System.out.println(klankzerrz.greet() );

    }
}
