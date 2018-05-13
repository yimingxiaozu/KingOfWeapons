package weaponking.game.app.lin.com.weaponking.model;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/25.
 * 军队基类
 */

public class Force {
    private GameMap gameMap;//该军队所在的地图
    private String forceName;//军队名称

    private ArrayList<Weapon> weapons;//该军队拥有的武器
    public Force(String forceName){
        weapons = new ArrayList<>();
        this.forceName = forceName;
    }

    public Force(String forceName, ArrayList<Weapon> weapons){
        this.weapons = weapons;
        this.forceName = forceName;
    }

    /**
     * 加入武器
     * @param weapon
     */
    public void addWeapon(Weapon weapon){
        if(weapons == null)
            weapons = new ArrayList<>();
        weapons.add(weapon);
    }

    /**
     * 获取军队的信息
     * @return
     */
    public String getForceInfo() {
       StringBuffer stringBuffer = new StringBuffer();
       for(Weapon weapon  : weapons){
           stringBuffer.append(weapon.getWeaponDescription() + "\n");
       }
       return stringBuffer.toString();
    }

    public String getForceName() {
        return forceName;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }
}
