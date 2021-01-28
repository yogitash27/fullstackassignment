import java.util.Scanner;
public class Assignment_6
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter number of Names you would like to enter:");
        count = scan.nextInt();
        
        
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        
        
        System.out.println("Enter the Names one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        
        
        
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
	    { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }


        
        System.out.print("Names in Ascending Order: ");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
        System.out.print("\n");
        System.out.print("Names in Descending Order: ");
        for (int i = count-1; i >=0; i--) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}