import java.util.*;
class Quiz
{
     static char A,B,C,D;
     static int coin=0,icnt=0;
     public static void Exit()
     {
        System.out.println("-------------------Exit The Game Becouse you are not press valid Choice-----------------------");   
     }
     public static void QuizFirstRaund()
    {
        char Choice='\0';
        int earn=0;
       
        Scanner F=new Scanner(System.in);
        System.out.println("-------------------Quiz First Raund Start-----------------------");
        System.out.println("In This Quiz There are 5 Quesion\n");
        System.out.println("In C Programming size Of Pointer Is");
        System.out.println("A: 4 Byte\n"+"B: 2 Byte\n"+"C: 8 Byte\n"+"D: Depends On Compiler\n");
        Choice = F.next().charAt(0);    //charAt(0) used to accept character
        if(Choice=='D')
        {
            System.out.println("Answer Is Correct");
            coin++;
            icnt++;
            earn=coin+coin;
            

            System.out.println("You Are Earn coin in:"+""+earn);
        }
        else
        {
            System.out.println("Answer is not Correct");
        }

        System.out.println("In C Programming how to use scanf");
        System.out.println("A: To Accept Input\n"+"B: 2 To Display\n"+"C: To Accept Inpput\n"+"D: Display Output\n");
        Choice = F.next().charAt(0);    //charAt(0) used to accept character
        if(Choice=='A')
        {
            System.out.println("Answer Is Correct");
            coin++;
            icnt++;
            earn=coin+coin;
            System.out.println("You Are Earn coin in:"+""+earn);
        }
        else
        {
            System.out.println("Answer is not Correct");
        }

        System.out.println("In C Programming size Of int");
        System.out.println("A: 1 Byte\n"+"B: 3 Byte\n"+"C: 4 Byte\n"+"D: 7 Byte\n");
        Choice = F.next().charAt(0);    //charAt(0) used to accept character
        if(Choice=='C')
        {
            System.out.println("Answer Is Correct");
            coin++;
            icnt++;
            earn=coin+coin;
            System.out.println("You Are Earn coin in:"+""+earn);
        }
        else
        {
            System.out.println("Answer is not Correct");
        }

        System.out.println("In C Programming size Of double Is");
        System.out.println("A: 4 Byte\n"+"B: 2 Byte\n"+"C: 8 Byte\n"+"D: 9 Byte\n");
        Choice = F.next().charAt(0);    //charAt(0) used to accept character
        if(Choice=='C')
        {
            System.out.println("Answer Is Correct");
            coin++;
            icnt++;
            earn=coin+coin;
            System.out.println("You Are Earn coin in:"+""+earn);
        }
        else
        {
            System.out.println("Answer is not Correct");
        }

        System.out.println("In C Programming size Of char Is");
        System.out.println("A: 4 Byte\n"+"B: 2 Byte\n"+"C: 1 Byte\n"+"D: Depends On Compiler\n");
        Choice = F.next().charAt(0);    //charAt(0) used to accept character
        if(Choice=='D')
        {
            System.out.println("Answer Is Correct");
            coin++;
            icnt++;
            earn=coin+coin;
            System.out.println("You Are Earn coin in:"+""+earn);
        }
        else
        {
            System.out.println("Answer is not Correct");
            System.out.println("You Are Earn coin in:"+""+earn);
        }
        System.out.println("------------------End Quiz First Raund---------------------------");
       
    }
    public static void SeccondRound()
    {
        icnt=0;
        int sum=0;
        int s=0;
        char choice;
        char a,b,c,d;
        Scanner SR=new Scanner(System.in);
       
        System.out.println("Welcome to Quiz Game In Seccond Round");   
        System.out.println("Do you want to start Seccond Round Then Press:\t0\n"+"Press:\t 1 To Exit The Game\n");
        s=SR.nextInt();

        if(s==0)
        {
            System.out.println("-------------------Quiz Second Round Start-----------------------");
            System.out.println("Q1\tWhich of the following option leads to the portability and security of Java?");
            System.out.println("a\t:Bytecode is executed by JVM\n"+"b\t: The applet makes the Java code secure and portable\n"+"c\t: Use of exception handling\n"+"d\t: Dynamic binding between objects\n"); 
            choice=SR.next().charAt(0);
            if(choice=='a')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q2\tWhich of the following is not a Java features?");
            System.out.println("\ta : Dynamic\n"+"\tb : Architecture Neutral\n"+"\tc : Use of pointers\n"+"\td : Object-oriented\n");
            choice=SR.next().charAt(0);
            if(choice=='c')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q3\tThe \u0021 article referred to as a");
            System.out.println("\ta : Unicode escape sequence\n"+"\tb : Octal escape\n"+"\tc : Hexadecimal\n"+"\td : Line feed\n");
            choice=SR.next().charAt(0);
            if(choice=='a')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q4\t_____ is used to find and fix bugs in the Java programs.");
            System.out.println("\ta : JVM\n"+"\tb : JRE\n"+"\tc : JDK\n"+"\td : JDB\n");
            choice=SR.next().charAt(0);
            if(choice=='d')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q5\tWhich method of the Class.class is used to determine the name of a class represented by the class object as a String?");
            System.out.println("\ta : getClass()\n"+"\tb : intern()\n"+"\tc : getName()\n"+"\td : toString()\n");
            choice=SR.next().charAt(0);
            if(choice=='c')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q6\t What is the return type of the hashCode() method in the Object class?");
            System.out.println("\ta : Object\n"+"\tb : int\n"+"\tc : long\n"+"\td : void\n");
            choice=SR.next().charAt(0);
            if(choice=='b')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q7\tWhich of the following is a valid long literal?");
            System.out.println("\ta : ABH8097\n"+"\tb : L990023\n"+"\tc : 904423\n"+"\td : 0xnf029L\n");
            choice=SR.next().charAt(0);
            if(choice=='d')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q8\tWhat does the expression float a = 35 / 0 return?");
            System.out.println("\ta : 0\n"+"\tb : Not a Number\n"+"\tc : Infinity\n"+"\td : Run time exception\n");
            choice=SR.next().charAt(0);
            if(choice=='c')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q9\tWhich of the following tool is used to generate API documentation in HTML format from doc comments in source code? ");
            System.out.println("\ta : javap tool\n"+"\tb : javaw command\n"+"\tc : Javadoc tool\n"+"\td : javah command\n");
            choice=SR.next().charAt(0);
            if(choice=='c')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            System.out.println("Q10\tWhich of the following for loop declaration is not valid?");
            System.out.println("\ta : for ( int i = 99; i >= 0; i / 9 )\n"+"\tb : for ( int i = 7; i <= 77; i += 7 )\n"+"\tc : for ( int i = 20; i >= 2; - -i )\n"+"\td : for ( int i = 2; i <= 20; i = 2* i )\n");
            choice=SR.next().charAt(0);
            if(choice=='a')
            {
                System.out.println("Your Answer Is Correct");
                icnt++;
                sum=icnt+icnt;
                System.out.println("You are Earn Coin is:\t"+sum);
            }
            else 
            {
                System.out.println("Your Answer Is Wrong");
            }

            
        }
        else if(s==1)
        {
            System.out.println("...............Exit Game.........................................\n");
        }
        else
        {
            System.out.println("your Are not Press valid Choice:Please Press Valid Input\n");
            SeccondRound();
        }
    }
    public static void main(String args[]) 
    {
        int a,b;
        a=1;
        System.out.println("Welcome to Quiz Game");
        System.out.println("In This Quiz There are Total 5 Quesion\n"+"Please Press 1 To start The Quiz First Raund\n");
        Scanner sc=new Scanner(System.in);
        Quiz QFR=new Quiz();
        b=sc.nextInt();
        if(a==1)
        {
            QFR.QuizFirstRaund();
        }
        if(icnt>=4)
        {
            System.out.println("You are win First Round");
            QFR.SeccondRound();
        }
        if(icnt>=3)
        {
            QFR.Exit();
        }
             
        
    }
}
