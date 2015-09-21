
public class PrintAsterisk {
    public static void main(String[] args) {
        PrintAsterisk printAsterisk = new PrintAsterisk();
        System.out.println("print one asterisk");
        printAsterisk.printAsterisk();
        System.out.println("print horizontal line");
        printAsterisk.printAsterisk(8);
        System.out.println("");
        System.out.println("print vertical line");
        printAsterisk.printVerticalAsterisk(3);
        System.out.println("print right triangle line");
        printAsterisk.printRightTriangle(3);
        System.out.println("print isosceles triangle");
        printAsterisk.printIsoscelesTriangle(3);
        System.out.println("print diamond");
        printAsterisk.printDiamond(3);
        System.out.println("print diamond with name");
        printAsterisk.printDiamondWithName(3);
        System.out.println("FuzzBuzzGame");
        printAsterisk.FizzBuzz();
        System.out.println("print prime factors");
        printAsterisk.generate(30);
    }

    public void printAsterisk() {
        System.out.println("*");
    }

    public void printAsterisk(int number) {
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }

    }

    public void printVerticalAsterisk(int number) {
        for (int index = 0; index < number; index++) {
            System.out.println("*");

        }
    }

    public void printRightTriangle(int number) {
        String star = null;
        for (int index = 0; index < number; index++) {
            star = "*";
            for (int num = 0; num < index; num++) {
                star += "*";
            }
            System.out.println(star);
        }
    }

    public void printIsoscelesTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2 * number + 1; j++) {
                if (j >= number - i && j <= number + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void printDiamond(int number) {
        printTopTriangle(number);
        printBottomTriangle(number);
    }

    public void printDiamondWithName(int number) {
        printTopTriangle(number);
        System.out.println("yaoping");
        for (int i = number - 2; i >= 0; i--) {
            for (int j = 0; j < 2 * number + 1; j++) {
                if (j >= number - i && j <= number + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

    public void FizzBuzz() {
        String context;
        for (int index = 1; index <= 100; index++) {
            if (index % 3 == 0 && index % 5 == 0) {
                context = "FizzBuzz";
            } else if (index % 3 == 0) {
                context = "Fizz";
            } else if (index % 5 == 0) {
                context = "Buzz";
            } else
                context = "" + index;
            System.out.println(context);
        }
    }

    public void generate(int number) {
        if (number != 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    System.out.print(i + "  ");
                }
            }
        } else {
            System.out.println(1);
        }

    }

    private void printTopTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2 * number + 1; j++) {
                if (j > number - i && j < number + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

    private void printBottomTriangle(int number) {
        for (int i = number - 1; i >= 0; i--) {
            for (int j = 0; j < 2 * number + 1; j++) {
                if (j >= number - i && j <= number + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }


}


