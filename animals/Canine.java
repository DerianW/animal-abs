package animals ;

public abstract class Canine extends Animal
{
    public String eat() { return "omnomnom" ; }
    public String eat(String food) { return "hey this is some good " + food ; }
}
