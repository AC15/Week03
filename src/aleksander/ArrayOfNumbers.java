package aleksander;

/**
 * Created by AC15 on 10/02/2018
 */
class ArrayOfNumbers {
    private int arrayOfIntegers[];

    ArrayOfNumbers(int arraySize) {
        this.arrayOfIntegers = new int[arraySize];
    }

    ArrayOfNumbers(int[] arrayOfIntegers) {
//        int arraySize = arrayOfIntegers.length;
//        this.arrayOfIntegers = new int[arraySize];
//
//        for (int i = 0; i < arraySize; i++) {
//            this.arrayOfIntegers[i] = arrayOfIntegers[i];
//        }

        this.arrayOfIntegers = arrayOfIntegers.clone();
    }

    int getItem(int index) {
        return arrayOfIntegers[index];
    }

    void setItem(int index, int value) {
        arrayOfIntegers[index] = value;
    }

    int max() {
        int max = arrayOfIntegers[0];

        for (int i = 1; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i] > max) {
                max = arrayOfIntegers[i];
            }
        }

        return max;
    }

    boolean equal(int first, int second) {
        return Integer.compare(arrayOfIntegers[first], arrayOfIntegers[second]) == 0;
    }
}
