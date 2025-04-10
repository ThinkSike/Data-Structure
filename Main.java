// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Binary Search Tree Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    tree.insert(value);
                    break;
                case 2:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    System.out.println(tree.search(value) ? "Found" : "Not Found");
                    break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    tree.delete(value);
                    System.out.println("Deleted if existed.");
                    break;
                case 4:
                    tree.inorder();
                    break;
                case 5:
                    tree.preorder();
                    break;
                case 6:
                    tree.postorder();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
