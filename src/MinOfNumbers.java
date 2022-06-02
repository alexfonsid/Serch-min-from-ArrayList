import java.util.*;

public class MinOfNumbers {
    public static void main(String[] args) {
        int length = 25;
        List<Integer> integerList = new ArrayList<>();
        Random gen = new Random();
        for (int i = 0; i < length; i++) {
            integerList.add(i, (gen.nextInt(length) + 2));
        }

        System.out.println(integerList);
        System.out.println(minOfList(integerList));
    }

    public static int minOfList(List<Integer> methList) {
        Integer min = Collections.min(methList);
        return min;
    }
}
