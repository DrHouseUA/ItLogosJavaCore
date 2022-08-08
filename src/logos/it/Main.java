package logos.it;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int a;
        char c = 'c';
        boolean isTrue = true;
        long l = 232;
        short s =12;
        double d = 2.5;
        float f = 2.41f;
        byte b = 123;

        System.out.println("Max int" + Integer.MAX_VALUE);
        System.out.println("Min int" + Integer.MIN_VALUE);
        System.out.println("Max byte" + Byte.MAX_VALUE);
        System.out.println("Min byte" + Byte.MIN_VALUE);
        System.out.println("Max long" + Long.MAX_VALUE);
        System.out.println("Min long" + Long.MIN_VALUE);
        System.out.println("Max short" + Short.MAX_VALUE);
        System.out.println("Min short" + Short.MIN_VALUE);
        System.out.println("Max double" + Double.MAX_VALUE);
        System.out.println("Min double" + Double.MIN_VALUE);
        System.out.println("Max float" + Float.MAX_VALUE);
        System.out.println("Min float" + Float.MIN_VALUE);

        int [] array1 = {34,145,61,5,62,41,24,356,4,11};

        System.out.println(Arrays.stream(array1).max());
        System.out.println(Arrays.stream(array1).min());

        boolean isSorted = false;
        int count = 0;

        while(!isSorted) {

            for (int i = 0; i < array1.length-1; i++) {

                if (array1[i]>array1[i+1]) {
                    int temp = array1[i];
                    array1[i] = array1[i+1];
                    array1[i+1] = temp;
                } else if (count == (array1.length-1)*(array1.length-1)) {
                    isSorted = true;
                }
                count++;
            }
        }

        for (int j : array1) {
            System.out.println(j);
        }
        System.out.println("Min value is " + array1[0]);
        System.out.println("Max value is " + array1[array1.length-1]);
    }
}