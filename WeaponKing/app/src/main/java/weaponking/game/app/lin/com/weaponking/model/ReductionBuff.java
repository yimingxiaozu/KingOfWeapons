package weaponking.game.app.lin.com.weaponking.model;

import java.math.RoundingMode;

/**
 * Created by lenovo on 2018/3/26.
 * 减甲buff
 */

public class ReductionBuff extends WeaponAttributeDecorator {

    private int reductionNum = 7;//减7点护甲

    /**
     * 构造函数
     * @param reductionNum 减甲数值
     * @param roundNum 持续的回合数
     */
    public ReductionBuff(int reductionNum, int roundNum) {
        this.reductionNum = reductionNum;
        setRoundNum(roundNum);//设置持续的回合数
    }

    public int getReductionNum() {
        return reductionNum;
    }

    public void setReductionNum(int reductionNum) {
        this.reductionNum = reductionNum;
    }


    /**
     * 获取被修饰过后的武器属性
     * @return
     */
    @Override
    public WeaponAttribute getDecoratedWeaponAttribute() {
        WeaponAttribute weaponAttribute  = new WeaponAttribute(getWeaponAttribute());
        //减去相应的护甲
        weaponAttribute.setArmour(weaponAttribute.getArmour() - reductionNum);
        return weaponAttribute;
    }
}
