package edu.sjsu.cs.cs151.battleship.model;

/**
 * The player class holds information regarding the number of ships a player has and the location of the ship.
 **/
public class Player
{  
	/**
	 * Constructs the player class.
	 */
	public Player()
	{
		if (NUM_OF_SHIPS != 5) {
			throw new IllegalArgumentException("ERROR! Num of ships must be 5");
		}

		ships = new Ship[NUM_OF_SHIPS];
		for (int i = 0; i < NUM_OF_SHIPS; i++)
		{
			Ship tempShip = new Ship(SHIP_LENGTHS[i]);
			ships[i] = tempShip;
		}

		playerGrid = new Grid();
		oppGrid = new Grid();
	}

	/**
	 * Chooses the location of the ship.
	 * @param sizeOfShip the ship identifier 
	 * @param row the row the ship will be in 
	 * @param col the column that the ship will be
	 * @param direction the direction the ship will go
	 **/
	public void chooseShipLocation(int sizeOfShip, int row, int col, int alignment)
	{
		Ship newShip = new Ship(sizeOfShip);
		playerGrid.addShip(newShip, row, col, alignment);
		playerGrid.printGrid();
	}

	/**
	 * Guess the location of the opponent's ship.
	 * @param row the row the ship will be in 
	 * @param col the column that the ship will be
	 * @param p2 the Player number
	 */
	public void guessOpponentShip(int row, int col, Player p2)
	{
		p2.playerGrid.guessShip(row, col);
		p2.playerGrid.printOppGrid();

	}

	/**
	 * Helper method that returns ships
	 * @return ships
	 */
	public Ship[] getShips()
	{
		return ships;
	}

	/**
	 * Helper method that returns playerGrid
	 * @return playerGrid
	 */
	public Grid getPlayerGrid()
	{
		return playerGrid;
	}

	/**
	 * Helper method that returns oppGrid
	 * @return oppGrid
	 */
	public Grid getoppGrid()
	{
		return oppGrid;
	}

	//lengths of all of the ships.
	private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
	//number of ships 
	private static final int NUM_OF_SHIPS = 5;
	private Ship[] ships;
	private Grid playerGrid;
	private Grid oppGrid;
}
