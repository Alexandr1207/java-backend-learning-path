void main(String[] args){
//    int[] arr = {1, 2, 3, 4};
//    System.out.println(arr[arr.length - 1]);
//
//    for (int num : arr){
//        System.out.println(num);
//    }



    // Task 1 (create and out)
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    for(int elem : arr){
        System.out.print(elem + " ");
    }

    System.out.println();

    // Task 2 (sum and avg)
    int s = 0;
    for(int elem : arr){
        s += elem;
    }
    double avg = (double) s / arr.length;
    System.out.println("Sum of arr is " + s);
    System.out.println("Average of arr is " + avg);

    // Task 3 (max and min)
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (max < arr[i]){
            max = arr[i];
        }
        if (min > arr[i]){
            min = arr[i];
        }
    }
    System.out.println("Maximum of array is " + max);
    System.out.println("Minimum of array is " + min);

    // Task 4 (count even and more then 10)
    int even = 0;
    int more_ten = 0;
    for (int elem : arr){
        if (elem % 2 == 0){
            even += 1;
        }
        if (elem > 10){
            more_ten += 1;
        }
    }
    System.out.println("Even numbers: " + even);
    System.out.println("More than 10 numbers: " + more_ten);

    // Task 5 (reverse)
    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
    for (int elem : arr){
        System.out.println(elem);
    }

    // Task 6 (search)
    int ind = -1;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 7){
            ind = i;
            break;
        }
    }
    if(ind >= 0){
        System.out.println("Index of 7 is " + ind);
    } else{
        System.out.println("There is not 7 in arr");
    }
}