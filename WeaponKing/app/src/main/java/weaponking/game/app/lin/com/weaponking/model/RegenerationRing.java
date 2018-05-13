package weaponking.game.app.lin.com.weaponking.model;

/**
 * Created by linyi on 2018/4/21.
 * 恢复指环, 增加生命上限100， 护甲加 1
 */

public class RegenerationRing extends Ornament {
    public RegenerationRing() {
            setDecoratingAttribute(new WeaponAttributeDecorator() {
                @Override
                public WeaponAttribute getDecoratedWeaponAttribute() {
                    WeaponAttribute weaponAttribute  = new WeaponAttribute(getWeaponAttribute());
                    //增加生命上限
                    weaponAttribute.setMaxHP(weaponAttribute.getMaxHP() + 100);
                    //护甲增加1
                    weaponAttribute.setArmour(weaponAttribute.getArmour() + 1);
                    return weaponAttribute;
                }

                @Override
                public WeaponAttribute getUndecoratedWeaponAttribute() {
                    WeaponAttribute weaponAttribute  = new WeaponAttribute(getWeaponAttribute());
                    //减去生命上限
                    weaponAttribute.setMaxHP(weaponAttribute.getMaxHP() - 100);
                    //护甲增加1
                    weaponAttribute.setArmour(weaponAttribute.getArmour() - 1);
                    return weaponAttribute;
                }
            });
    }
}
