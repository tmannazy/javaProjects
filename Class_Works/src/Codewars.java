package src;

public class Codewars {
    public static void main(String[] args) {
        int[] file = {4, 6, 2, 1, 9, 63, -134, 566};
        System.out.println(min(file));


    }

    private static int min(int[] list) {
        int min_num = list[0];
        for (int i = 0; i < list.length; i++) {
            if (min_num > list[i]) {
                min_num = list[i];
            } else if (min_num == list[i]) {
                min_num = list[i];
            }
            return min_num;
        }
        return 0;
    }


    public static int max(int[] list) {
        int max_num = list[0];
        for (int i = 0; i < list.length; i++) {
            if (max_num < list[i]) {
                max_num = list[i];
            }
            return max_num;
        }
        return 0;
    }
}
