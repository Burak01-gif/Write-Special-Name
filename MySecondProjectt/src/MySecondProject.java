import java.util.Scanner;

    public class MySecondProject {
        public static void main(String[] args) {
            Scanner MyScanner = new Scanner(System.in);
            int sayı = 6;

            while (true) {
                System.out.println("Hello, Welcome to Işık NameIt program.");
                System.out.println("-x------------------------------------------");
                System.out.println("The following options are available for you:");
                System.out.println("1) Display a name");
                System.out.println("2) Change the size");
                System.out.println("3) Exit Program");
                System.out.print("Choose an option: ");
                int option = MyScanner.nextInt();
                if (option == 1) {
                    name(sayı);
                    break;

                } else if (option == 2) {
                    System.out.print("What is the new size?: ");
                    int size = MyScanner.nextInt();
                    sayı = size;
                } else if (option == 3) {
                    System.out.println("exiting the program");
                    break;
                } else {
                    System.out.print("There is no such option.");
                    System.out.println("Please try again!");
                }
            }
        }

        public static void name(int sayı) {
            Scanner MyScanner = new Scanner(System.in);
            System.out.print("What is your name?: ");
            String name = MyScanner.nextLine();
            for (int i = 0; i < name.length(); i++) {
                name.charAt(i);
                switch (name.charAt(i)) {
                    case 'A':
                    case 'a':
                        A(sayı);
                        System.out.println();
                        System.out.println();
                        break;

                    case 'B':
                    case 'b':
                        B(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'C':
                    case 'c':
                        C(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'D':
                    case 'd':
                        D(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'E':
                    case 'e':
                        E(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'F':
                    case 'f':
                        F(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'G':
                    case 'g':
                        G(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'H':
                    case 'h':
                        H(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'I':
                    case 'ı':
                        I(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'J':
                    case 'j':
                        J(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'K':
                    case 'k':
                        K(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'L':
                    case 'l':
                        L(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'M':
                    case 'm':
                        M(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'N':
                    case 'n':
                        N(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'O':
                    case 'o':
                        O(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'P':
                    case 'p':
                        P(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'Q':
                    case 'q':
                        Q(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'R':
                    case 'r':
                        R(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'S':
                    case 's':
                        S(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'T':
                    case 't':
                        T(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'U':
                    case 'u':
                        U(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'V':
                    case 'v':
                        V(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'W':
                    case 'w':
                        W(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'X':
                    case 'x':
                        X(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'Y':
                    case 'y':
                        Y(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                    case 'Z':
                    case 'z':
                        Z(sayı);
                        System.out.println();
                        System.out.println();
                        break;
                }
            }
        }

        public static void A(int sayı) {
            for (int i = 0; i < sayı; i++) {
                for (int j = 0; j < 4; j++) {

                    if ((i == 0 || i == 2) && j < 4) {
                        System.out.print(" * ");
                    } else if ((j == 0 || j == 3) && i < 6) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }

        }

        public static void B(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == sayı / 2 || i == sayı - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } else {
                        for (int c = 0; c < sayı; c++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }
        }

        public static void C(int sayı) {
            for (int i = 0; i < sayı; i++) {

                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == sayı - 1) {
                        for (int c = 1; c < 1; c++) {
                            System.out.print(" ");

                        }
                        for (int d = 0; d < sayı; d++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    } else {
                        System.out.println("*");
                    }
                }
            }
        }

        public static void D(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i != sayı - 1) {
                        for (int b = 0; b < i; b++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        System.out.println();
                    } else {
                        for (int c = 0; c < sayı; c++) {
                            System.out.print("*");
                        }
                    }
                }
            }
        }

        public static void E(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == sayı / 2 || i == sayı - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } else {
                        System.out.println();
                    }

                }
            }
        }

        public static void F(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == (sayı / 2) - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } else {
                        System.out.println();
                    }
                }
            }
        }

        public static void G(int sayı) {
            int i, j;
            for (i = 0; i < sayı; i++) {
                for (j = 0; j < sayı; j++) {
                    if ((j == 1 && i != 0 && i != sayı - 1) ||
                            ((i == 0 || i == sayı - 1) && j > 1 &&
                                    j < sayı - 2) || (i == ((sayı - 1) / 2) &&
                            j > 2 && j < sayı - 1) || (j == sayı - 2 &&
                            i != 0 && i >= ((sayı - 1) / 2) && i != sayı - 1))
                        System.out.print("*");
                    else
                        System.out.print(" ");

                }
                System.out.println();
            }
        }


        public static void H(int sayı) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 4; j++) {

                    if (i == 2 && j < 4) {
                        System.out.print(" ");
                    } else if ((j == 0 || j == 3) && i < 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void I(int sayı) {
            for (int i = 0; i < sayı; i++) {
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == sayı - 1) {
                        for (int b = 0; b < sayı / 2 + 1; b++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    } else {
                        for (int c = 0; c < sayı / 2 + 2; c++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }
        }

        public static void J(int sayı) {
            for (int i = 0; i < sayı; i++) {
                for (int a = 0; a < 1; a++) {

                }
                if (i == sayı - 1) {
                    for (int b = 0; b < sayı / 2 - 2; b++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");

                } else if (i == 0) {
                    for (int k = 0; k < sayı / 2 - 1; k++) {
                        System.out.print(" ");

                    }
                    System.out.println("*");
                } else if (i == sayı - 2) {
                    for (int o = 0; o < sayı / 2 - 2; o++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int p = 0; p < 2 - 1; p++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                } else {
                    for (int d = 0; d < sayı / 2; d++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
        }

        public static void K(int sayı) {
            for (int i = 0; i <= sayı / 2; i++) {
                System.out.print("*");
                for (int b = 0; b < (sayı / 2) - i; b++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 1; i <= sayı / 2; i++) {
                System.out.print("*");
                for (int b = 0; b < i; b++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }


        public static void L(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                if (i == sayı - 1) {
                    for (int b = 0; b < sayı - 1; b++) {
                        System.out.print(" *");
                    }
                    System.out.println();
                } else {
                    System.out.println();
                }
            }
        }

        public static void M(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    for (int b = 0; b < i; b++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int c = 0; c <= (2 * sayı - 3) - (2 * i); c++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int d = 0; d < i; d++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
        }

        public static void N(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    for (int b = 0; b < i; b++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int c = 0; c < sayı - i - 1; c++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");

                }
            }
        }

        public static void O(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == sayı - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    } else {
                        for (int b = 0; b < 2 * sayı - 3; b++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }
        }

        public static void P(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == (sayı / 2) - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } else if (i > 0 && i < (sayı / 2) - 1) {
                        for (int c = 0; c < sayı - 2; c++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    } else {
                        System.out.println();
                    }
                }
            }
        }

        public static void Q(int sayı) {
            for (int i = 0; i < sayı; i++) {
                if(i != sayı - 1) System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == sayı - 2) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    } else if(i == sayı - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print("  ");
                        }
                        System.out.print(" *");
                    } else {
                        for (int b = 0; b < 2*sayı-3; b++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }
        }


        public static void R(int sayı) {
            for (int i = 0; i < sayı / 2; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == sayı / 2 - 1) {
                        for (int b = 0; b < sayı; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } else {
                        for (int c = 0; c < sayı; c++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }
            for (int i = 0; i <= sayı / 2; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    for (int b = 0; b < i; b++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
        }

        public static void S(int sayı) {
            for (int i = 0; i <= sayı / 2; i++) {
                for (int a = 0; a < 1; a++) {
                    if (i == 0 || i == (sayı / 2)) {
                        for (int b = 0; b < sayı; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } else {
                        System.out.println("*");
                    }
                }
            }
            for (int i = 0; i < (sayı / 2); i++) {
                for (int a = 0; a < 1; a++) {
                    if (i != (sayı / 2) - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    } else {
                        for (int c = 0; c < sayı; c++) {
                            System.out.print("*");
                        }
                    }
                }
            }
        }

        public static void T(int sayı) {
            for (int i = 0; i < sayı; i++) {
                for (int a = 0; a < 1; a++) {
                    if (i == 0) {
                        for (int b = 0; b < sayı; b++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    } else {
                        for (int k = 0; k < sayı - 1; k++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }
        }

        public static void U(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int a = 0; a < 1; a++) {
                    if (i == sayı - 1) {
                        for (int b = 0; b < sayı - 1; b++) {
                            System.out.print("*");
                        }
                    } else {
                        for (int c = 0; c < sayı - 2; c++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        System.out.println();
                    }
                }
            }
        }

        public static void V(int sayı) {
            int k = sayı;
            for (int i = 0; i < sayı; i++) {
                for (int a = 0; a < 1; a++) {
                    for (int b = 0; b < i; b++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    k--;
                }
                if (i != sayı - 1) {
                    for (int b = 0; b < 2 * k - 1; b++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                } else {
                    System.out.println();
                }
            }
        }

        public static void W(int sayı) {
            for (int i = 0; i < sayı; i++) {
                System.out.print("*");
                for (int b = 0; b < sayı - i; b++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int c = 0; c <= (2 * (sayı) - 3) - (2 * (sayı - i)) + 2; c++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int d = 0; d < sayı - i; d++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }

        public static void X(int sayı){
            for (int i = 1; i<sayı; i++)
            {            for (int a=1; a<=5; a++){
                if ((i == a) || (i == 1 && a == 5) || (i == 2 && a == 4) || ( i== 4 && a == 2)  || (i == 5 && a == 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                System.out.println();
            }
        }
        public static void Y(int sayı){
            int y = sayı;
            for (int i = 0; i < sayı / 2; i++) {
                for (int a = 0; a < 1; a++) {
                    for (int b = 0; b < i + 2; b++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    y--;
                }
                for (int b = 0; b < y - i; b++) {
                    System.out.print(" ");
                }
                System.out.println("*");

            }
            for (int i = 0; i < sayı / 2; i++) {
                for (int a = 0; a < 1; a++) {
                    for (int b = 0; b < sayı / 2 + 2; b++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
            for (int i = 0; i < 1; i++) {
                for (int a = 0; a < sayı / 2 + 2; a++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
        public static void Z(int sayı){
            for (int i = sayı; i > 0; i--) {
                for (int a = 0; a < 1; a++) {
                    if (i == sayı || i == 1) {
                        for (int b = 0; b < sayı; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    } else {
                        for (int c = 0; c < i; c++) {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                }
            }
        }
    }
