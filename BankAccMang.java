//? Create a basic system to handle bank account operations like deposit, withdrawal, and balance inquiry.
import java.util.*;
import java.io.*;
class Bank{
    int accNo, amount;
    String accType;
    Bank(int accNo,int amount,String accType){
        this.accNo=accNo;
        this.amount=amount;
        this.accType=accType;
    }
    Scanner sc=new Scanner(System.in);
    void deposit(){
        int deposit=sc.nextInt();
        amount+=deposit;
    }
    void withdraw(){
        int withdraw=sc.nextInt();
        if(withdraw>amount){
            System.out.println("Insufficient Balance");
        }else{
            amount-=withdraw;
        }
    }
    void balance(){
        System.out.println("The balance in the bank account is "+amount);
    }
}
public class BankAccMang{
    public static void main(String[] args){
        System.out.println("-------------------------------------------------------WELCOME TO ASHU'S BANK-------------------------------------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Give bank details: ");
        System.out.println("1)AccNo\n2)Amount\n3)Account Type");
        int AccNo=sc.nextInt();
        int amount=sc.nextInt();
        String AccType=sc.nextLine();
        Bank bk=new Bank(AccNo,amount,AccType);
        System.out.println("What do you want to do?: ");
        System.out.println("1)Check Balance\n2)Deposit Money\n3)Withdraw Money\n4)Exit");
        int choice=sc.nextInt();
        while(true){
        switch(choice){
            case 1:
            bk.balance();
            break;
            case 2:
            bk.deposit();
            break;
            case 3:
            bk.withdraw();
            break;
            case 4:
            System.out.println("Thanks for using Ashu's bank.");
            break;
            default:
            System.out.println("Invalid Input");
            break;
        }
        break;
    }
}
}