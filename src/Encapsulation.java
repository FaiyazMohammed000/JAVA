public class Encapsulation {
    String str="Hello Welcome";
    public void greetings()
    {
        System.out.println(str);
    }
}
class Encap
{
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.greetings();
    }
}
