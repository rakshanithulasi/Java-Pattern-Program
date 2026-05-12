public class Inverted_Right_triangle 
{
    public static void main(String[] args) {
        int n = 5;
        for(int i=n; i>=0; i--)
        {
            for(int j=0; j<i; j++)
            {
                if(j<i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
