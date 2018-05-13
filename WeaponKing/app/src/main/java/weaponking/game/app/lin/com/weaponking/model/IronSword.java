package weaponking.game.app.lin.com.weaponking.model;

import java.util.ArrayList;

import weaponking.game.app.lin.com.weaponking.utils.CommonUtil;

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
        setWeaponAttributeByOrnaments(getDecoratedByOrnamentsAttribute());//设置被饰品修饰过后的属性
        setWeaponAttributeFinal(getFinalAttribute());//设置加上各种buff之后的属性
    }

    @Override
    public void draw() {

    }

    @Override
    public void attack(Weapon weaponBeingAttacked) {

         Damage damage = new Damage();
         damage.setDamageType(Damage.DAMAGE_TYPE.TYPE_PHYSICAL);
         damage.setDamage(10);//击打一下扣10滴血
         damage.setFromWeapon(this);
         damage.setToWeapon(weaponBeingAttacked);
         damage.setProCriticalHit(0.5f);//50%暴击概率
         damage.setMulCriticalHit(2);//暴击倍数为两倍

         weaponBeingAttacked.beingAttacked(damage);
         //创建造成的伤害
    }

    @Override
    public void beingAttacked(Damage damage) {
         //被攻击, 先加上buff, 获取被攻击之后的属性
        if(damage.getBuffs() != null){
            for(WeaponAttributeDecorator buff : damage.getBuffs()){
                addBuff(buff);//添加buff
            }
        }
        WeaponAttribute curWeaponAttribute = getFinalAttribute();
        int finalDamage = 0;
        switch(damage.getDamageType()){
            case TYPE_HOLY:
                finalDamage = damage.getDamage();
                break;
            case TYPE_MAGIC:
                finalDamage = damage.getDamage();
                break;
            case TYPE_PHYSICAL:
                finalDamage = damage.getDamage();
                break;
        }
        curWeaponAttribute.setHP(curWeaponAttribute.getHP() - damage.getDamage());

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

    @Override
    public String getWeaponDescription() {
        return "铁剑 : " + CommonUtil.getWeaponAttributeInfo(getFinalAttribute());
    }

}
