import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {
    if (row+1 < grid.length && col+1 < grid[0].length){
      if (grid[row+1][col] < grid[row][col+1]){
        Location loc = new Location (row+1, col);
        return loc;
      }
      else{
        Location loc = new Location (row, col+1);
        return loc;
      }
    }

    else if (row+1 < grid.length){
      Location loc = new Location (row+1, col);
      return loc;
    }

    else{
      Location loc = new Location (row, col+1);
      return loc;
    }
    
  }

  
  // PART B
  public int sumPath(int row, int col) {
    int sum = 0;
    int r = row;
    int c = col;

    while (r < grid.length && c < grid[0].length){
      sum += grid[r][c];
      Location loc = getNextLoc(r,c);
      r = loc.getRow();
      c = loc.getCol();
      System.out.println(r + " " +c);
    }
    
    return sum;
  }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
