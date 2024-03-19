import java.util.Scanner;
import java.util.Stack;
public class HandleComplementaryPasses {
    Scanner reader = new Scanner(System.in);
    Stack<ComplmeentaryPasses>compPasses = new Stack<>();
    public void  handleComplementaryPasses(){
        int choice = 0;
        while (choice != 5) {
            System.out.println("Here are the complementary passes operations available to you");
            System.out.println("1. Redeem complementary passes");
            System.out.println("2. Display the list of redeemed complementary passes");
            System.out.println("3. Display the last redeemed complementary pass");
            System.out.println("4. Undo the redeemed complementary pass:");
            System.out.println("5. QUIT");
            choice = reader.nextInt();
            reader.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of performances to add: ");
                    int num = reader.nextInt();
                    reader.nextLine();
                    redeemComplementaryPassess(num);
                    break;
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemedComplementaryPass();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void redeemComplementaryPassess(int numOfPasses){
        if(compPasses.size()>= 10){
            System.out.println("Invalid operation. All the complementary passes have alread been redeemed");
            System.out.println("Would you like to see the list of redeemed complementary passes?(Y/N)");
            char choice = reader.nextLine().charAt(0);
            if(choice == 'Y'){
                displayComplementaryPasses();
                return;
            }
        }
        else{
            int i = 0;
            do{
                System.out.println("Enter the Complementary Pass ID");
                String ID = reader.nextLine();

                System.out.println("Enter the access level");
                String accessLevel = reader.nextLine();

                ComplmeentaryPasses pass = new ComplmeentaryPasses(ID, accessLevel);
                compPasses.push(pass);
                i++;
            }while(i<numOfPasses);

        }
    }
    public void displayComplementaryPasses(){
        System.out.println("The last redeemed complementary pass is:"+ compPasses);

    }
    public void displayLastRedeemedComplementaryPass(){
        System.out.println("The last redeemed complementary pass is"+compPasses.peek());
    }
    public void undoRedeemedComplementaryPass(){
        System.out.println("Enter the Pass ID you want to udo");
        String ID = reader.nextLine();

        for(ComplmeentaryPasses pass : compPasses){
            if(pass.getPassID().equals(ID)){
                compPasses.pop();
                System.out.println("The pass with the ID" + ID +"has been removed from the redeemed list.");
            }
        }
    }
}
