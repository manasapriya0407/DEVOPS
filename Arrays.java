import java.util.Scanner;

class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter " + n + " names");

        String[] names = new String[n]; 

        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("Displaying names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
