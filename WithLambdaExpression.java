//Usage of Lambda Expression
interface Drawable2{
    public void draw();
}

//Testing Lambda expression without any parameters and with return statement
interface Sayable{
    public String say();
}

//Testing Lambda expression with one parameter and with return statement
interface Sayable2{
    public String say(String name);
}

//Testing Lambda Expression with multiple parameters
interface Addable{
    public int add(int a, int b);
}

public class WithLambdaExpression {
    public static void main(String[] args) {
        //Usage of Lambda Expression
        int width = 10;
        Drawable2 d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
        //Testing Lambda expression without any parameters and with return statement
        Sayable s = () ->{
            return "Hello! World";
        };
        System.out.println(s.say());
        //Testing Lambda expression with one parameter and with return statement
        Sayable2 s1 = (name) -> {
            return "Hello " + name;
        };
        System.out.println(s1.say("Subhrajit"));
        Sayable2 s2 = name -> {
            return "Your surname is " + name;
        };
        System.out.println(s2.say("Sengupta"));
        //Testing Lambda Expression with multiple parameters
        Addable ad1 = (a,b) -> (a+b);
        System.out.println(ad1.add(10,20));
        Addable ad2 = (int a, int b) -> (a+b);
        System.out.println(ad2.add(100,200));
    }
}
