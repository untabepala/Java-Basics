import com.atmcard.ATMoperationInterface;
import com.atmcard.AtmOperationImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMoperationInterface op=new AtmOperationImpl() ;
        int atmnumber=12345;
        int atmpin=123;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!");
        System.out.println("Enter ATM Number : ");
        int atmNumber=sc.nextInt();
        System.out.println("Enter PIN : ");
        int pin=sc.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==pin)){
            while (true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit\nEnter Choice:");
                int ch=sc.nextInt();
                if (ch==1){
                    op.viewBalance();
                } else if (ch==2) {
                    System.out.println("Enter Withdraw Amount to Withdraw: ");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch==3) {
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch==4) {
                    op.viewMiniStatement();
                } else if (ch==5) {
                    System.out.println("Collect Your ATM Card");
                    System.exit(0);
                }else{
                    System.out.println("Please Enter correct Choice");
                }
            }
        }else{
            System.out.println("Incorrect ATM Number or PIN");
            System.exit(0);
        }
    }

}