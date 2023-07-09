public class linear_search {
    public static int linear_search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 5, 10, 45, 56, 15, 10, 32, 11, };
        int key = 15;
        int index = linear_search(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key at find: " + key);
        }
    }
}