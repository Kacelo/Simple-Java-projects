/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author Justcallmekk
 */
import java.util.Scanner;
//class creation 
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //atm Machine object created
        AtmMachine acc1 = new AtmMachine();
        
        //scnner object created
        Scanner sc = new Scanner(System.in);
        int choice;
        
        //Menu
        System.out.println("Please Select an Option");
        System.out.println("1. View My Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
      
        
        do{
            System.out.println("Enter Option");
              choice=sc.nextInt();
        
              //switch statement to provide selection options
        switch(choice)
            
        {
            case 1:
                acc1.viewBalance();
                break;
            case 2:
                acc1.withdraw();
                break;
            case 3: 
                
                acc1.deposit();
                break;
            case 4: System.out.println("************Good BYE****************");
            break;
            default:
                break;
                
        }
        
        }while(choice !=4);
        // TODO code application logic here
    }
    
}
