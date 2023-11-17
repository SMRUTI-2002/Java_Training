package infinite;

public class Ex8 {
    public void max(int num1, int num2, int num3) {
        // Assuming number1 as the max number
        int m = num1;
       //  if num2 is greater than the current value of m.
       // m to be equal to num2
        if (m < num2) {
            m = num2;
        }
        if (m < num3) {
            m = num3;
        }
        System.out.println("Maximum value is " + m);

        // Assuming max value is 0
        int maxval = 0;
        //why use if statement?
          // Code to be executed if the condition is true
        if (num1 > num2) {
            maxval = num1;
        } else {
            maxval = num2;
        }
        if (maxval > num3) {
            System.out.println("Maximum value is " + maxval);
        } else {
            System.out.println("Maximum value is " + num3);
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        Ex8 obj = new Ex8();
        obj.max(num1, num2, num3);
    }
}