import java.util.*;
public class movezeros{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int arr[] = new int[n];
        int temp;
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        for(int e:arr)
            {
                System.out.print(e);
            }
    }
}