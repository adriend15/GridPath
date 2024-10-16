


public class GridPath
{

    private int[][] grid;

    public Location getNextLoc(int row, int col) {
        Location toTheRight = new Location(row, col+1);
        Location below = new Location(row+1, col);

        if(row == grid.length-1) {
            return toTheRight;
        }

        if(col == grid.length) {

        }
        if(grid[row + 1][col] < grid[row][col + 1])
            return below;
        else
            return toTheRight;

    }

    public int sumPath(int row, int col) { /* to be implemented in part (b) */
    }

}