abstract class Abstraction {
    abstract void eat();
}
class Child extends Abstraction{
    public void eat()
    {
        System.out.println("eating Lunch");
    }
}
class Demo1
{
    public static void main(String[] args){
        Child obj=new Child();
                obj.eat();
    }
}


