import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        List<Integer> integers = new ArrayList<>();

        for(int i = 0; i < input.length; i++){
            integers.add(Integer.parseInt(input[i]));
        }

        integers.removeIf(number -> number%2 != 0);
        integers.forEach(number -> System.out.print(number + " "));
        System.out.println();
        integers.sort(Integer::compareTo);
        integers.forEach(number -> System.out.print(number + " "));

// for(int i = 0; i < integers.size(); i++){
// if(integers.get(i) % 2 == 0){
// System.out.print(integers.get(i) + " ");
// }
// }
// System.out.println();
// Collections.sort(integers);
//
// for(int i = 0; i < integers.size(); i++){
// if(integers.get(i) % 2 == 0){
// System.out.print(integers.get(i) + " ");
// }
// }
    }
}