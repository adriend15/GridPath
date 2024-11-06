


public class GridPath
{

    private int[][] grid;
    public GridPath(int[][] values) {
        grid = values;
    }
    public String toString() {
        String s = "";
        for(int row = 0; row < grid.length;row++) {
            for (int col = 0; col < grid[0].length; col++) {
                s+= grid[row][col] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public Location getNextLoc(int row, int col) {
        Location toTheRight = new Location(row, col+1);
        Location below = new Location(row+1, col);

        if(row == grid.length-1) {
            return toTheRight;
        }

        if(col == grid[0].length-1) {
            return below;
        }
        if(grid[row + 1][col] < grid[row][col + 1])
            return below;
        else
            return toTheRight;

    }

    public int sumPath(int row, int col) {
        int sum = grid[row][col];
        Location currentLoc = getNextLoc(row, col);

        while(currentLoc != null)
        {
            sum += grid[currentLoc.getRow()][currentLoc.getCol()];

            if(currentLoc.getRow() < grid.length - 1 || currentLoc.getCol() < grid[0].length - 1)
                currentLoc = getNextLoc(currentLoc.getRow(), currentLoc.getCol());
            else
                currentLoc = null;
        }

        return sum;
    }

}