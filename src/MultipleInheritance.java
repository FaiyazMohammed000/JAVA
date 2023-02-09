interface i1
{
    void eat();
}
interface i2 extends i1
{
    void repeat();
}
class MultipleInheritance implements i1,i2 {
    public void eat()
    {
        System.out.println("eating");
    }
    public void repeat(){
        System.out.println("eating again");
    }
}
class D1
{
    public static void main(String[] args) {
        MultipleInheritance obj=new MultipleInheritance();
        obj.eat();
        obj.repeat();
    }
}
