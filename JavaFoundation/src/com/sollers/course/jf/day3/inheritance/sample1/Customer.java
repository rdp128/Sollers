package com.sollers.course.jf.day3.inheritance.sample1;

import java.util.Scanner;


public class Customer extends Profile {
    Chequing cheq;
    Saving sav;
    public Customer(String Username, String password,double balance1, double balance2, boolean flag){
        super(Username,password,"Customer");
        cheq = new Chequing();
        cheq.balance=balance1;
        if(flag==true){
            sav= new Saving();
            sav.balance=balance2;
        }
        else{
            sav=null;
        }
        
    }
    public void transferFunds(){
        int flag;
        double amount;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        if(sav==null){
           System.out.println("you cannot transfer you only have one account");
        }
        else{
        System.out.println("to transfer from saving to chequing enter 1");
        System.out.println("to transfer from chequing to saving enter 0");
        flag=scan1.nextInt();
        System.out.println("enter the amount you want to transfer");
        amount=scan2.nextDouble();
        if(flag==1&&amount<=sav.balance){
            sav.balance=sav.balance-amount;
            cheq.balance=cheq.balance+amount;
        }
        else if(flag==0&&amount<=cheq.balance){
            cheq.balance=cheq.balance-amount;
            sav.balance=sav.balance+amount;
            
        }
        else{
            System.out.println("insufficient funds");
            
        }
        }
        
        
    }
    public void displayBalance(){
        int flag;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("to view chequin balance enter 1, to view saving balance enter 0");
        flag=scan1.nextInt();
        if(flag==1){
            System.out.println("Chequing balance: $"+cheq.balance);
        }
        else if(flag==0){
            if(sav==null){
               System.out.println("you do not have a savings account"); 
            }
            else{
                System.out.println("saving balance: $"+sav.balance);
            }
        }
        
    }
    
}
