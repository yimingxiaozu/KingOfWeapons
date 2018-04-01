package weaponking.game.app.lin.com.weaponking.model;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/27.
 * 饰品基类
 */

public abstract class Ornament {
      private WeaponAttributeDecorator decoratingAttribute;//修正的属性
    private ArrayList<WeaponDecorator> decorateSkills;//装饰的技能与特效

    public WeaponAttributeDecorator getDecoratingAttribute() {
        return decoratingAttribute;
    }

    public void setDecoratingAttribute(WeaponAttributeDecorator decoratingAttribute) {
        this.decoratingAttribute = decoratingAttribute;
    }

    public ArrayList<WeaponDecorator> getDecorateSkills() {
        return decorateSkills;
    }

    public void setDecorateSkills(ArrayList<WeaponDecorator> decorateSkills) {
        this.decorateSkills = decorateSkills;
    }
}
