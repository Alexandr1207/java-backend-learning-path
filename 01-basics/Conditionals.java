void main(){
    // Some console in/out
    int x = 10;
    int y = 20;
    System.out.printf("x=%d; y=%d\n", x, y);
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = in.nextInt();

    System.out.printf("Your number is %d\n", num);

    // Conditionals
    System.out.print("Enter num1: ");
    int num1 = in.nextInt();
    System.out.print("Enter num2: ");
    int num2 = in.nextInt();
    if (num1 > num2){
        System.out.println("Num1 is larger");
    } else if (num1 == num2){
        System.out.println("Numbers are equal");
    } else{
        System.out.println("Num2 is larger");
    }
}