public class CustomExceptions extends Exception {

}
    class Custom
    {
        public static void main(String[] args) {
            try {
                throw new CustomExceptions();
            }
            catch (CustomExceptions ex)
            {
                System.out.println("Caught the exception");
                System.out.println(ex.getMessage());
            }
            System.out.println("Rest of code");
        }
    }

