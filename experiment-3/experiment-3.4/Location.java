public class Location
{
    public int row;
    public int column;
    public double maxValue;

    public Location(int r, int c, double m)
    {
        row = r;
        column = c;
        maxValue = m;
    }

    public static Location locateLargetst(double[][] a)
    {
        int row = a.length;
        int column = a[0].length;
        var l = new Location(row, column, a[0][0]);

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                if (a[i][j] > l.maxValue)
                {
                    l.maxValue = a[i][j];
                    l.row = i;
                    l.column = j;
                }
            }
        }
        return l;
    }
}
