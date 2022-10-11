public class Main {
    public static void main(String[] args) {


        int[] arrayStraight = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayReverse = new int[arrayStraight.length];
        int indexReverse;

        for (int i = arrayStraight.length-1 ; i >=0 ; i--) {

            indexReverse = arrayStraight.length - 1 - i;
            arrayReverse[indexReverse] = arrayStraight[i];

        }

        for (int i = 0; i < arrayStraight.length; i++) {
            System.out.print("arrayStraight[" + i + "] = " + arrayStraight[i]);
            System.out.println("  arrayReverse["+i+"] = " + arrayReverse[i]);
        }


    }
}