
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`



public class Reverse {

    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int arrayLength = aj.length;
        for (int i = 0; i < arrayLength/2; i++) {
            int temp = aj[i];
            aj[i] = aj[arrayLength - 1 - i];
            aj[arrayLength - 1 - i] = temp;
        }
        for (int i = 0; i < aj.length; i++) {
            System.out.println(aj[i]);
        }
    }
}

