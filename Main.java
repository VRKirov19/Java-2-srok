public class Main {
    public static void main(String[] args) {
        try {
            int i = 12;
            int j = 0;
            int result = i/j;
            System.out.println(result);
        } catch (NumberFormatException ex){
            System.out.println(ex.getMessage() + "!!!");
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage() + "...");
        } catch (Exception ex){
            System.out.println(ex.getMessage() + ",,,,,");
        }
        System.out.println("test");
    }
}