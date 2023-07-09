public class max_subarrayPart2 {
    public static void maxSubarray(int number[]) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length]; // create new array
        prefix[0] = number[0];

        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = 1; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // ternary operator check //
                                                                                      // condition

                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
            }

        }
        System.out.println("max sum is : " + MaxSum);
    }

    // KADANE'S ALGORITHM
    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println(cs);   //current sum check krna hai ki kitna hai 

        System.out.println("our max value is :" + ms);

    }

    public static void main(String args[]) {
        // int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int number[] = {1,-2,6,-1,3};
        // kadanes(number);
        maxSubarray(number);

    }
}