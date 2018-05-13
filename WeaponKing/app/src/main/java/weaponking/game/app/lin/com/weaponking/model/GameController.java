package weaponking.game.app.lin.com.weaponking.model;

/**
 * Created by lenovo on 2018/3/26.
 * 游戏控制器,控制游戏的进行流程
 */

public class GameController {

    private GameMap gameMap;//游戏地图

    private int currentRoundNum = 0;//当前总回合数

    public GameController(GameMap gameMap){
        this.gameMap = gameMap;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public int getCurrentRoundNum() {
        return currentRoundNum;
    }

    public void setCurrentRoundNum(int currentRoundNum) {
        this.currentRoundNum = currentRoundNum;
    }
}
