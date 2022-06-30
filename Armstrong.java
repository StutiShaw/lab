public class Armstrong {

    public static void main(String[] args) {

        int n = 371, number, temp, t = 0; //declaring variable

        number = n;
        while (n!= 0)
        {
            temp = n % 10;  // logic
            t = t + temp*temp*temp;
            n =n / 10;
        }

        if(t == number)
            System.out.println("The number is an Armstrong number :"+number);  // to print statement
        else
            System.out.println("The number is not an Armstrong number :"+number);
    }
}
