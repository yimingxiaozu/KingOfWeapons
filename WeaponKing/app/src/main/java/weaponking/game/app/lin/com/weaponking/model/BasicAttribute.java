package weaponking.game.app.lin.com.weaponking.model;

/**
 * Created by lenovo on 2018/3/25.
 * 属性基类,不能被创建
 */

public abstract class BasicAttribute {

    public enum OBJECT_TYPE{
        WEAPON, //武器
        BUILDING , //建筑物
        OBSTACLE  //障碍物
    }//物体类型

    private int pos_block_x;//x坐标 第x个格子
    private int pos_block_y;//y坐标 第y个格子

    private OBJECT_TYPE objectType;//物体类型
    private boolean movable;//是否能够移动
    private boolean isGod;//是否是无敌， 无敌表示不会受到伤害，攻击一击致命
    private boolean canAttack;//是否能够攻击

    public int getPos_block_x() {
        return pos_block_x;
    }

    public void setPos_block_x(int pos_block_x) {
        this.pos_block_x = pos_block_x;
    }

    public int getPos_block_y() {
        return pos_block_y;
    }

    public void setPos_block_y(int pos_block_y) {
        this.pos_block_y = pos_block_y;
    }

    public OBJECT_TYPE getObjectType() {
        return objectType;
    }

    public void setObjectType(OBJECT_TYPE objectType) {
        this.objectType = objectType;
    }

    public boolean isMovable() {
        return movable;
    }

    public void setMovable(boolean movable) {
        this.movable = movable;
    }

    public boolean isGod() {
        return isGod;
    }

    public void setIsGod(boolean god) {
        isGod = god;
    }

    public boolean canAttack() {
        return canAttack;
    }

    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }
}
