package weaponking.game.app.lin.com.weaponking.model;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/27.
 * 铁剑
 */

public class IronSword  extends Weapon{
    /**
     * 构造函数, 传入基本属性
     */
    public IronSword(){
        ceateSelfWeaponAttribute();//创建属性
    }

    @Override
    public void draw() {

    }

    @Override
    public void attack(Weapon weaponBeingAttacked) {


         //创建造成的伤害
    }

    @Override
    public void beingAttacked(Damage damage) {

    }

    @Override
    public void afterAttack(Weapon beingAttacked) {

    }

    @Override
    public void ceateSelfWeaponAttribute() {
         //实现自己的属性
        WeaponAttribute weaponAttribute = new WeaponAttribute();
        weaponAttribute.setMaxHP(100);
        weaponAttribute.setHP(100);
        weaponAttribute.setArmour(10);
        weaponAttribute.setDamageType(Damage.DAMAGE_TYPE.TYPE_PHYSICAL);
        weaponAttribute.setAwakeDistance(1);//唤醒距离
        weaponAttribute.setDps(10);
        weaponAttribute.setMagicDefense(0.2f);
        weaponAttribute.setMaxMana(100);
        weaponAttribute.setMana(100);
        weaponAttribute.setMovingDistance(1);//移动距离为1
        setWeaponAttributePrimitive(weaponAttribute);//设置原始属性
    }

}
