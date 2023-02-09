public interface MyInterface {
    void sum();
}
class  Myclass implements MyInterface
{
    public void sum()
    {
        int a=10,b=20;
        int c=a+b;
        System.out.println("sum is "+c);
    }
}
class Demo3
{
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        obj.sum();
    }
}


