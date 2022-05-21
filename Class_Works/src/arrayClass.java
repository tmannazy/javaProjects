package src;

public class arrayClass {
    public static void main(String[] args) {
        int[] array = {10, 20, 33, -6, -7};
        int counter = 0;
        int sumTotal = 0;
        int smallest = array[0];
        int largest = array[0];
        int average = 0;

        while (counter < array.length) {
            sumTotal += array[counter];
            if (smallest > array[counter]) smallest = array[counter];
            if (largest < array[counter]) largest = array[counter];
            average = sumTotal / array.length;
            counter++;
        }

        for (int i : array) {
            sumTotal += i;
            if (smallest > i) smallest = i;
            if (largest < i) largest = i;
            average = sumTotal / array.length;
        }

        System.out.println("total of the numbers " + sumTotal);
        System.out.println("largest number " + largest);
        System.out.println("average of the numbers " + average);
        System.out.println("smallest number " + smallest);


        int[][] twodArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] ints : twodArray) {
            for (int j = 0; j < twodArray.length; j++) {
                System.out.println(ints[j]);
            }

        }
    }

//    public static void stringValue(String newString) {
//        String newString = "Return";
//        arrayClass.stringValue(newString);
//        System.out.println(newString);
//        newString = "Here";
//        System.out.println(newString);
//    }


//    private static void twoDArray() {
//        int[][] twodArray = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int i = 0; i < twodArray.length; i++) {
//
//        }

//    }

}