import javax.naming.ldap.BasicControl;
import javax.xml.transform.Source;
import java.awt.image.BandCombineOp;
import java.util.Scanner;

void main() {
    var sc = new Scanner(System.in);

    int accountNumber;
    String name;
    float value;
    char choice;

    System.out.print("Enter account number: ");
    accountNumber = sc.nextInt();
    System.out.print("Enter account holder: ");
    sc.nextLine();
    name = sc.nextLine();
    System.out.print("Is there an initial deposit (y/n)? ");
    choice = sc.next().charAt(0);

    if(choice == 'y'){
        System.out.print("Enter inital deposit value: ");
        value = sc.nextFloat();
    }
    else{
        value = 0;
    }

    var account = new BankAccount(accountNumber, name, value);

    System.out.println("Account data:");
    System.out.println(account);

    System.out.println("\nEnter a deposit value: ");
    value = sc.nextFloat();
    account.deposit(value);

    System.out.println("Updated account data:");
    System.out.println(account);

    System.out.println("\nEnter a withdraw value: ");
    value = sc.nextFloat();
    if(!account.withdraw(value)){
        System.out.println("Withdraw value is bigger than account balance.");
    }

    System.out.println("Updated account data:");
    System.out.println(account);

    sc.close();
}
