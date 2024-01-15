package Section9.SortedArrays;

public class Main {
    public static void main(String[] args) {
        int[] input = SortedArrays.getIntegers(5);
        SortedArrays.printArray(input);
        SortedArrays.sortIntegers(input);
        System.out.println("=".repeat(30));
        SortedArrays.printArray(input);

        String teste = "aaaaa";
        System.out.println(teste.length());

    }
}
