public class MethodOverloading {
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(double a,double b)
    {
        System.out.println(a+b);
    }
}
class Test
{
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.sum(10,20);
        obj.sum(27.3,3.5);
    }
}

