public class Right_triangle_star_pattern 
{
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(j<=i)
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
