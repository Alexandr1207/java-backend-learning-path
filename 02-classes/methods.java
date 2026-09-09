class Program{
    public static void main(){
//        Person person = new Person();
//
//        person.say("Hello world");
//        person.say("Goodbye world");
//
//        person.sum(3, 5);
//        person.sum(7, 8, 4, 1, 2, 7);

        int[] test_arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(sum(test_arr[0], test_arr[1]));
        System.out.println(max(test_arr[0], test_arr[test_arr.length - 1]));
        System.out.println(max(test_arr[0], test_arr[2], test_arr[test_arr.length - 2]));

        int test_sum = sum(test_arr);
        System.out.println("Sum of array: " + test_sum);
        System.out.println("Sum of array is " + isEven(test_sum));

        int arr_length = test_arr.length;
        System.out.println(factorial(arr_length));

        System.out.println(printArray(test_arr));

    }


    static int sum(int ...nums){
        int res = 0;
        for (int elem : nums){
            res += elem;
        }
        return res;
    }

    static int max(int a, int b){
        return a > b ? a : b;
    }

    static int max(int a, int b, int c){
        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        }

        return c;
    }

    static boolean isEven(int num){
        return num % 2 == 0;
    }

    static int factorial(int n){
        if (n <= 1) return 1;

        return n * factorial(n - 1);
    }

    static String printArray(int[] arr){
        String res = "";
        for (int elem : arr){
            res = res + elem + " ";
        }
        return res;
    }
}


//class Person{
//    void say(String msg){
//        System.out.println(msg);
//    }
//
//    void sum(int ...nums){
//        int res = 0;
//        for(int elem : nums){
//            res += elem;
//        }
//        System.out.println(res);
//    }
//}
