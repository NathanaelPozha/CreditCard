package CreditCard.src.creditcard;

import java.util.Scanner;

public class CreditCard {

Scanner scan = new Scanner(System.in);

    public void StartSystem() {
    
    System.out.println("Credit Card Program by Nathanael Pozha");

    System.out.println("Please enter a customer name:");
    String customerName = scan.nextLine();

    System.out.println("Please enter the customer's member level:");
    String customerLevel = scan.nextLine();

    System.out.println("Please enter the current balance:");
    String number = scan.nextLine();
    double customerBalance = Double.parseDouble(number);

    System.out.println("Was the payment made late?");
    String customerPayment = scan.nextLine();

    if ("Silver".equalsIgnoreCase(customerLevel) || "Gold".equalsIgnoreCase(customerLevel)){

        if ("Silver".equalsIgnoreCase(customerLevel) && "Yes".equalsIgnoreCase(customerPayment)){
            
            System.out.println("==============================================");
            System.out.println("Statement");
            System.out.println("==============================================");
            
            System.out.println("Billing information for " + customerName);
            System.out.println("Customer Level: " + customerLevel);
            System.out.printf("Credit Card Balance: $%.2f%n", customerBalance);
            
            final Double LATE_FEES = 20.0;
            final Double PRINCIPLE_FEES = 0.02;
            Double paymentToPrinciple = customerBalance * PRINCIPLE_FEES;
            
            final Double INTEREST_RATE = 0.03;
            Double paymentToInterest = customerBalance * INTEREST_RATE;
            
            Double totalPayment = paymentToPrinciple + paymentToInterest + LATE_FEES;
            Double percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            
            System.out.println("Interest rate for late payment: 3% per month");
            System.out.printf("Late fee: $%.2f%n", LATE_FEES);
            System.out.printf("Required minimum payment: $%.2f%n", totalPayment);
            System.out.printf("Amount going to principle: $%.2f%n", paymentToPrinciple);
            System.out.printf("Percent of minimum payment going to principle: %.2f%%%n", percentToPrinciple);

        }

        if ("Silver".equalsIgnoreCase(customerLevel) && "No".equalsIgnoreCase(customerPayment)){

            System.out.println("==============================================");
            System.out.println("Statement");
            System.out.println("==============================================");
            
            System.out.println("Billing information for " + customerName);
            System.out.println("Customer Level: " + customerLevel);
            System.out.printf("Credit Card Balance: $%.2f%n", customerBalance);

            final Double PRINCIPLE_FEES = 0.02;
            Double paymentToPrinciple = customerBalance * PRINCIPLE_FEES;

            final Double INTEREST_RATE = 0.03;
            Double paymentToInterest = customerBalance * INTEREST_RATE;

            Double totalPayment = paymentToPrinciple + paymentToInterest;

            Double percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);

            System.out.println("Interest rate: 3% per month");
            System.out.printf("Required minimum payment: $%.2f%n", totalPayment);
            System.out.printf("Amount going to principle: $%.2f%n", paymentToPrinciple);
            System.out.printf("Percent of minimum payment going to principle: %.2f%%%n", percentToPrinciple);

        }
        
        if ("Gold".equalsIgnoreCase(customerLevel) && "Yes".equalsIgnoreCase(customerPayment)){

            System.out.println("==============================================");
            System.out.println("Statement");
            System.out.println("==============================================");
            
            System.out.println("Billing information for " + customerName);
            System.out.println("Customer Level: " + customerLevel);
            System.out.printf("Credit Card Balance: $%.2f%n", customerBalance);

            final Double PRINCIPLE_FEES = 0.02;
            Double paymentToPrinciple = customerBalance * PRINCIPLE_FEES;
            
            final Double INTEREST_RATE = 0.02;
            Double lateFees = 2 * INTEREST_RATE;
            Double paymentToInterest = customerBalance * lateFees;
            
            Double totalPayment = paymentToPrinciple + paymentToInterest;
            Double percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            
            System.out.println("Interest rate for late payment: 4% per month");
            System.out.printf("Late fee: $%.2f%n", paymentToInterest);
            System.out.printf("Required minimum payment: $%.2f%n", totalPayment);
            System.out.printf("Amount going to principle: $%.2f%n", paymentToPrinciple);
            System.out.printf("Percent of minimum payment going to principle: %.2f%%%n", percentToPrinciple);
        
        }

        if ("Gold".equalsIgnoreCase(customerLevel) && "No".equalsIgnoreCase(customerPayment)){

            System.out.println("==============================================");
            System.out.println("Statement");
            System.out.println("==============================================");
            
            System.out.println("Billing information for " + customerName);
            System.out.println("Customer Level: " + customerLevel);
            System.out.printf("Credit Card Balance: $%.2f%n", customerBalance);

            final Double PRINCIPLE_FEES = 0.02;
            Double paymentToPrinciple = customerBalance * PRINCIPLE_FEES;
            
            final Double INTEREST_RATE = 0.02;
            Double paymentToInterest = customerBalance * INTEREST_RATE;
            
            Double totalPayment = paymentToPrinciple + paymentToInterest;
            Double percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            
            System.out.println("Interest rate: 2% per month");
            System.out.printf("Required minimum payment: $%.2f%n", totalPayment);
            System.out.printf("Amount going to principle: $%.2f%n", paymentToPrinciple);
            System.out.printf("Percent of minimum payment going to principle: %.2f%%%n", percentToPrinciple);

        }

         if ("Platinum".equalsIgnoreCase(customerLevel) && "Yes".equalsIgnoreCase(customerPayment)){

            System.out.println("==============================================");
            System.out.println("Statement");
            System.out.println("==============================================");
            
            System.out.println("Billing information for " + customerName);
            System.out.println("Customer Level: " + customerLevel);
            System.out.printf("Credit Card Balance: $%.2f%n", customerBalance);

            final Double PRINCIPLE_FEES = 0.02;
            Double paymentToPrinciple = customerBalance * PRINCIPLE_FEES;
            
            final Double INTEREST_RATE = 0.01;
            Double lateFees = 2 * INTEREST_RATE;
            Double paymentToInterest = customerBalance * lateFees;
            
            Double totalPayment = paymentToPrinciple + paymentToInterest;
            Double percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            
            System.out.println("Interest rate for late payment: 4% per month");
            System.out.printf("Late fee: $%.2f%n", paymentToInterest);
            System.out.printf("Required minimum payment: $%.2f%n", totalPayment);
            System.out.printf("Amount going to principle: $%.2f%n", paymentToPrinciple);
            System.out.printf("Percent of minimum payment going to principle: %.2f%%%n", percentToPrinciple);
        
        }

        if ("Platinum".equalsIgnoreCase(customerLevel) && "No".equalsIgnoreCase(customerPayment)){

            System.out.println("==============================================");
            System.out.println("Statement");
            System.out.println("==============================================");
            
            System.out.println("Billing information for " + customerName);
            System.out.println("Customer Level: " + customerLevel);
            System.out.printf("Credit Card Balance: $%.2f%n", customerBalance);

            final Double PRINCIPLE_FEES = 0.02;
            Double paymentToPrinciple = customerBalance * PRINCIPLE_FEES;
            
            final Double INTEREST_RATE = 0.01;
            Double paymentToInterest = customerBalance * INTEREST_RATE;
            
            Double totalPayment = paymentToPrinciple + paymentToInterest;
            Double percentToPrinciple = 100 * (paymentToPrinciple/totalPayment);
            
            System.out.println("Interest rate: 1% per month");
            System.out.printf("Required minimum payment: $%.2f%n", totalPayment);
            System.out.printf("Amount going to principle: $%.2f%n", paymentToPrinciple);
            System.out.printf("Percent of minimum payment going to principle: %.2f%%%n", percentToPrinciple);

        }

    
    } else {
        System.out.println("Error: Invalid customer level");
        System.out.println("Exiting now");
        
        System.exit(0);
    }
}
}
