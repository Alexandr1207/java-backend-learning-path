void main(String[] args){
    Scanner in = new Scanner(System.in);
    boolean flag = true;

    while (flag){
        System.out.println("Enter your positive number:");
        int number = in.nextInt();
        if (number <= 0){
            System.out.printf("Number %d is not positive\n", number);
            continue;
        }

        // Sum of digits
        int s = 0;
        int num_length = 0;
        int new_num = number;
        while(new_num > 0){
            s += new_num % 10;
            num_length++;
            new_num /= 10;
        }
        System.out.println("Sum of number is " + s);

        // Count of digits
        System.out.println("Number length is " + num_length);

        // Reverse
        int reversedNum = 0;
        int orig_num = number;
        while(orig_num > 0){
            reversedNum = reversedNum * 10 + orig_num % 10;
            orig_num /= 10;
        }
        System.out.println("Reversed num: " + reversedNum);

        // Is Palindrome
        if (reversedNum == number){
            System.out.println("Number is palindrome");
        } else{
            System.out.println("Number is NOT palindrome");
        }

        // Factorial
        int fact = 1;
        if (number < 20){
            for (int i = 1; i < number + 1; i++) {
                fact *= i;
            }
            System.out.println("Factorial is " + fact);
        } else{
            System.out.println("Number is too big");
        }


        // Even numbers
        int orig = number;
        int act_num = 0;
        System.out.println("Even digits in number:");
        while(orig > 0){
            act_num = orig % 10;
            if (act_num % 2 == 0){
                System.out.println(act_num);
            }
            orig /= 10;
        }

        // The biggest digit
        int original = number;
        int act;
        int res = 0;
        while (original > 0){
            act = original % 10;
            if (res < act){
                res = act;
            }
            original /= 10;
        }
        System.out.println("The biggest digit is " + res);

        System.out.println("Do you want to enter new number?(yes or no)");
        String answer = in.next();
        if (answer.equalsIgnoreCase("no")){
            flag = false;
        }
    }
}