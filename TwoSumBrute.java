
    import java.util.Scanner;

    public class TwoSumBrute {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n");
            int n = sc.nextInt();
            System.out.println("Enetr array");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        // System.out.println("Enterr target");
            int target=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]+arr[j]==target){
                        System.out.println("indexes " + i + " , " + j );
                        return;
                    }
                }
            }
            System.out.println("Pair not found");

        }
    }
