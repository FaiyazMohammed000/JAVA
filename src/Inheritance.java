public class Inheritance {
    void eat() {
        System.out.println("eating");
    }
}
class child extends Inheritance
{
    void speak()
    {
        System.out.println("speaking");
    }
}
class Demo
{
    public static void main(String[] args) {
         child obj=new child();
        obj.eat();
        obj.speak();
    }
}
