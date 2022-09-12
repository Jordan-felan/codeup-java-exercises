package SudokoGame.problemdomain;

import java.io.Serializable;

public class SudukoGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCOpyOfGridState() {
        return SudukoUtilities.copyToNewArray(gridState);
    }

    public SudukoGame(GameState gameState, int[][] gridState){
        this.gameState = gameState;
        this.gridState = gridState;
    }
}
