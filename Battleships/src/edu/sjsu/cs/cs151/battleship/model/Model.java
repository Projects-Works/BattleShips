package edu.sjsu.cs.cs151.battleship.model;

/**
 * The model for the battleship
 */
public class Model 
{
	/**
	 * Constructor of the Model class
	 */
	public Model()
	{
		this.grid = new Grid();
		p1 = new Player();
		p2 = new Player();
	}
	
	/**
	 * Starts a new game
	 * @return
	 */
	public Model newGame()
	{
		return new Model();
	}

	/**
	 * Gets the game status
	 * @return
	 */
	public boolean getStatus()
	{
		return gameStats;
	}
	
	/**
	 * Determines if they won
	 * @return true or false
	 */
	public boolean isWinner()
	{
		if (gameStats)
		{
			if(this.getNumofCells() == 17)
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets the number of cells 
	 * @return cellCt
	 */
	public int getNumofCells()
	{
		return cellCt;
	}
	
	/**
	 * Gets the row
	 * @return row
	 */
	public int getRow()
	{
		return row;
	}
	
	/**
	 * Gets the column 
	 * @return column 
	 */ 
	public int getColumn()
	{
		return column;
	}
	
	/**
	 * Gets the grid 
	 * @return grid
	 */
	public Grid getGrid()
	{
		return grid;
	}
	
	/**
	 * gets player 1
	 * @return p1
	 */
	public Player getPlayer1()
	{
		return p1;
	}
	
	/**
	 * gets player 2
	 * @return p2
	 */
	public Player getPlayer2()
	{
		return p2;
	}

	public boolean gameStats;
	private int row;
	private int column;
	private int cellCt;
	private Player p1;
	private Player p2;
	private Grid grid;
}