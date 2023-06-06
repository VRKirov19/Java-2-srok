import java.util.*;
public class Main {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     String[] input = scanner.nextLine().split("\\s+");
     List<Integer> numbers = Arrays.stream(input)
             .map(e -> Integer.parseInt(e))
             .collect(Collection.toList());
    }
}