/*
  class GameGrid
  
  Taher Haji
  4/30/2022
  AP Computer Science A
  
  Summary of File: This file creates game grid
*/
public class GameGrid {
	

	private String[][] grid = {{" "," "," "},
							         {" "," "," "},
							         {" "," "," "}};
	

	public GameGrid(){
   
   }
	

	public void play(boolean x, int r, int c)
	{
		if(x)
			grid[r][c] = "X";
		else
			grid[r][c] = "O";
	}
	

	public boolean winner()
	{
		for(int x = 0; x <= 2; x++)
		{
			if(!grid[x][0].equals(" ") && grid[x][0].equals(grid[x][1]) && grid[x][1].equals(grid[x][2]))
				return true;				
			if(!grid[0][x].equals(" ") && grid[0][x].equals(grid[1][x]) && grid[1][x].equals(grid[2][x]))
				return true;				
		}
		if(grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) && !grid[0][0].equals(" "))
			return true;
		if(grid[2][0].equals(grid[1][1]) && grid[1][1].equals(grid[0][2]) && !grid[2][0].equals(" "))
			return true;
		return false;
	}
	

	public boolean draw()
	{
		for(int r = 0; r < grid.length; r++)
			for(int c = 0; c < grid[0].length; c++)
				if(grid[r][c].equals(" "))
					return false;
		return true;
	}
	

	public boolean validPlay(int r, int c)
	{
		return (r >=0 && r <= 2) && (c >=0 && c <= 2) && grid[r][c].equals(" ");
	}
	

	public String toString()
	{
		String str = "";
		str = "-------\n";
		str += "|" + grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2] + "|\n";
		str += "-------\n";
		str += "|" + grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2] + "|\n";
		str += "-------\n";
		str += "|" + grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2] + "|\n";
		str += "-------\n";
		return str;
	}

}
