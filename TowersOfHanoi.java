public class TowersOfHanoi
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        move(25, 'A', 'B', 'C' );
        long stop = System.currentTimeMillis();
        System.out.println("Elapsed Time: " + (stop - start) + " ms");
        System.out.println("Moves: " + moves);
    }

    public static void move(int n, char from, char other, char to)
    {
        if(n <= 1)
        {
            System.out.println("Move " + n + " from " + from + " to " + to);
        }
        else
        {
            move(n-1, from, to, other);
            System.out.println("Move " + n + " from " + from + " to " + to);
            move(n - 1, other, from, to);
        }
    }

}
