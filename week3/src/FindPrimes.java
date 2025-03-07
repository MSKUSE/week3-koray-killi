public class FindPrimes {
    public static void main(String[] args) {
        if (args.length == 1) {
            int max = Integer.parseInt(args[0]);

            for(int i = 2; i<= max;i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) System.out.println(i);

            }
        /*
           if (range == 2){
                System.out.println("2");
            } else if (range<2) {
                System.out.println("Integer must be bigger than 2.");
            }else {
                for (int numb = 3; numb <= range; numb++) {
                    for (int primer = 2; primer < numb; primer++) {
                        if (numb % primer != 0) {
                            break;
                        }

                    }
                }
            }
        } else {
            System.out.println("Please provide an argument.");
        }
    }
*/
        } else {
            System.out.print("Please provide an argument.");
            }
      }
    }


