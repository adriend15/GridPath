public class Location
{
    private int theRow;
    private int theCol;
    public Location(int r, int c)
    {
        theRow = r;
        theCol = c;
    }
    public String toString() {
        return theRow + "," + theCol;
    }
    public int getRow()
    { return theRow; }
    public int getCol()
    { return theCol; }
}