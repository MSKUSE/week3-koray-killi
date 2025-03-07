public class FindMaximum {

    public static void main(String[] args){
        if (args.length == 2) {

            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            boolean condition = number1>number2;
            int max = condition ? number1 : number2;
            System.out.println(max);

            // if (number1>number2) {
            //    System.out.println("The first argument is bigger.");
            //} else if (number2>number1) {
            //    System.out.println("The second argument is bigger.");
            //} else{
            //    System.out.println("The arguments are equal.");
            //}

        } else {
            System.out.println("Please provide two arguments.");
        }
    }
}
