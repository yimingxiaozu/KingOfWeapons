package weaponking.game.app.lin.com.weaponking.model;

/**
 * Created by lenovo on 2018/3/25.
 * 武器属性的装饰类, 其子类代表一些buff(如 减甲， 魔法伤害加深
 */

public abstract class WeaponAttributeDecorator extends WeaponAttribute{
    enum BUFF_TYPE{
        BUFFTYPE_GOOD, //有益buff
        BUFFTYPE_BAD, //debuff
    }

    private int roundNum;//持续的回合数

    public int getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(int roundNum) {
        this.roundNum = roundNum;
    }

    private WeaponAttribute weaponAttribute;//原始的武器属性

    private BUFF_TYPE buffType;

    public BUFF_TYPE getBuffType() {
        return buffType;
    }

    public void setBuffType(BUFF_TYPE buffType) {
        this.buffType = buffType;
    }

    public void setWeaponAttribute(WeaponAttribute weaponAttribute) {
        this.weaponAttribute = weaponAttribute;
    }

    public WeaponAttribute getWeaponAttribute() {
        return weaponAttribute;
    }

    /**
     * 获取被修饰过得武器属性
     * @return
     */
    public abstract WeaponAttribute getDecoratedWeaponAttribute();

    /**
     * 获取修饰之前的属性
     * @return
     */
    public  abstract WeaponAttribute getUndecoratedWeaponAttribute();

}
