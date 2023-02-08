public class ExceptionHandling {
    public static void main(String[] args) {
        try {

            try {
                throw new ArithmeticException("my exception");
            } catch (ArithmeticException ae) {
                System.out.println(ae);
            }
            try {
                int a[] = new int[5];
                a[10] = 98;
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println(ae);
            }
        }
        catch (Exception e)
        {
            System.out.println("exception handled");
        }
        finally {
            System.out.println("finally is always executed ");
        }
        System.out.println("rest of code");
    }
}
