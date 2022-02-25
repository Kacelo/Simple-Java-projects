/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Emilie
 */
//import Scanner from java.util package
import java.util.Scanner;
public class AtmMachine {
    //instance variables
    private double money;
    private double depositAmount;
    private double withdrawAmount;
    
    //scanner object created to take in user input
    Scanner scan = new Scanner(System.in);
    
    //overloaded constructor to initialise object
    public AtmMachine(double money, double depositAmount, double withdrawAmount) {
        this.money = money;
        this.depositAmount = depositAmount;
        this.withdrawAmount=withdrawAmount;
    }
    
    // default constructor
    public AtmMachine()
    {
        this.money=0;
        this.depositAmount=0;
        this.withdrawAmount=0;
    }
//setter and getter  methods
    public void setMoney(double money) {
        this.money = money;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getMoney() {
        return money;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    
    //Deposit Method
    public void deposit()
    {
     
        System.out.println("Please Enter Amount you would like to deposit"); 
        setDepositAmount(depositAmount=scan.nextDouble());
        
        money = money +depositAmount;
        System.out.println("Your New Balance is:" + money);
    }
     //Withdraw Method
    public void withdraw()
    {
        System.out.println("Enter Amount you wish to withdraw:");
        withdrawAmount=scan.nextDouble();
        if(withdrawAmount>money|| withdrawAmount==0)
        {System.out.println("You have insufficeint funds");
        }
        else
        {
        setMoney(money-withdrawAmount);
            System.out.println("You have withdrawn:N$"+withdrawAmount+"Your Reamaining Balance is:N$" +money);
        }
    }
    //View Balance Method
    public void viewBalance()
    {
        System.out.println("Your Blance is:N$" + getMoney());
    }
    
}
