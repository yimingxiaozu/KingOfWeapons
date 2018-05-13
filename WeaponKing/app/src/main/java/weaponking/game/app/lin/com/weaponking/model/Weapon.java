package weaponking.game.app.lin.com.weaponking.model;

import android.util.Log;

import java.util.ArrayList;

import weaponking.game.app.lin.com.weaponking.utils.CommonUtil;

/**
 * Created by lenovo on 2018/3/25.
 * 武器抽象类，定义基本的属性和方法
 */

public abstract class Weapon extends  BasicObject{

    private WeaponAttribute weaponAttributePrimitive;//该武器的原始属性

    private WeaponAttribute weaponAttributeByOrnaments;//被饰品修饰过后的属性

    private WeaponAttribute weaponAttributeFinal;//加上各种buff和饰品最后的属性

    private ArrayList<WeaponAttributeDecorator> buffAttribute;//该武器被添加的buff

    private ArrayList<Ability> abilities;//拥有的技能

    private ArrayList<Ornament> ornaments;//拥有的饰品

    /**
     * 获取被饰品修饰过后的武器属性
     * @return
     */
    public WeaponAttribute getDecoratedByOrnamentsAttribute(){
        //获取饰品的属性加成
        WeaponAttribute attribute = weaponAttributePrimitive;
        if(ornaments != null){
            for(Ornament ornament : ornaments){
                if(ornament != null){
                    WeaponAttributeDecorator decorator = ornament.getDecoratingAttribute();//获取修饰补正
                    if(decorator != null){
                        decorator.setWeaponAttribute(attribute);
                        attribute = decorator.getDecoratedWeaponAttribute();//获取修饰过后的属性
                    }
                }

            }
        }
        //最终的attribute即为被修饰过的属性
        return attribute;
    }

    /**
     * 获取被buff修饰过后的最终的属性
     * @return
     */
    public WeaponAttribute getFinalAttribute() {
        WeaponAttribute weaponAttribute = weaponAttributeFinal == null ? weaponAttributePrimitive : weaponAttributeFinal;
        if(buffAttribute != null) {
            for(WeaponAttributeDecorator buff : buffAttribute) {
                   if(buff != null) {
                       buff.setWeaponAttribute(weaponAttribute);
                       weaponAttribute = buff.getDecoratedWeaponAttribute();//获取修饰过后的属性
                   }
            }
        }
        return weaponAttribute;
    }

    /**
     * 装备饰品
     * @param ornament
     */
    public void armOrnament(Ornament ornament){
        if(ornament == null)
            return;
        if(ornaments == null)
            ornaments = new ArrayList<>();
        ornaments.add(ornament);//装备饰品
        //修正属性
        WeaponAttributeDecorator decorator = ornament.getDecoratingAttribute();//获取修饰补正
        if(decorator != null){
            decorator.setWeaponAttribute(weaponAttributeByOrnaments);
            weaponAttributeByOrnaments = decorator.getDecoratedWeaponAttribute();//获取修饰过后的属性
        }
    }

    /**
     * 卸下饰品
     * @param index 饰品在列表中的序号
     */
    public void disarmOrnament(int index){
         if(ornaments == null || index < 0 || index >= ornaments.size())
             return;
         Ornament removedOrnament = ornaments.remove(index);
         if(removedOrnament == null)
             return;
        //修正属性
        WeaponAttributeDecorator decorator = removedOrnament.getDecoratingAttribute();//获取修饰补正
        if(decorator != null){
            decorator.setWeaponAttribute(weaponAttributeByOrnaments);
            weaponAttributeByOrnaments = decorator.getUndecoratedWeaponAttribute();//获取修饰过后的属性
        }
    }

    /**
     * 给该武器添加buff
     * @param buff
     */
    public void addBuff(WeaponAttributeDecorator buff){
        if(buff == null)
            return;
        if(buffAttribute == null)
            buffAttribute = new ArrayList<>();
        buffAttribute.add(buff);
        //修正属性
        buff.setWeaponAttribute(weaponAttributeFinal);
        weaponAttributeFinal = buff.getDecoratedWeaponAttribute();//获取修饰过后的属性
    }

    /**
     * 接触buff
     * @param index
     */
    public void removeBuff(int index) {
        if(buffAttribute == null || index < 0 || index >= buffAttribute.size())
            return;
        WeaponAttributeDecorator removedBuff = buffAttribute.remove(index);
        //修正属性
        if(removedBuff != null){
            removedBuff.setWeaponAttribute(weaponAttributeFinal);
            weaponAttributeByOrnaments = removedBuff.getUndecoratedWeaponAttribute();//获取修饰过后的属性
        }
    }



    /**
     * 攻击
     * @param weaponBeingAttacked 被攻击的物体
     */
    public abstract void attack(Weapon weaponBeingAttacked);

    /**
     * 被攻击时出发
     * @param damage 受到的伤害
     */
    public abstract void beingAttacked(Damage damage);

    /**
     * 攻击结束之后调用
     * @param beingAttacked 被攻击的武器
     */
    public abstract void afterAttack(Weapon beingAttacked);

    /**
     * 工厂方法, 由子类去创建自己的属性
     */
    public abstract void ceateSelfWeaponAttribute();

    /**
     * 获取武器的名称
     */
    public abstract String getWeaponDescription();

    public WeaponAttribute getWeaponAttributePrimitive() {
        return weaponAttributePrimitive;
    }

    public void setWeaponAttributePrimitive(WeaponAttribute weaponAttributePrimitive) {
        this.weaponAttributePrimitive = weaponAttributePrimitive;
    }

    public WeaponAttribute getWeaponAttributeFinal() {
        return weaponAttributeFinal;
    }

    public void setWeaponAttributeFinal(WeaponAttribute weaponAttributeFinal) {
        this.weaponAttributeFinal = weaponAttributeFinal;
    }

    public ArrayList<WeaponAttributeDecorator> getBuffAttribute() {
        return buffAttribute;
    }

    public void setBuffAttribute(ArrayList<WeaponAttributeDecorator> buffAttribute) {
        this.buffAttribute = buffAttribute;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Ornament> getOrnaments() {
        return ornaments;
    }

    public void setOrnaments(ArrayList<Ornament> ornaments) {
        this.ornaments = ornaments;
    }

    public WeaponAttribute getWeaponAttributeByOrnaments() {
        return weaponAttributeByOrnaments;
    }

    public void setWeaponAttributeByOrnaments(WeaponAttribute weaponAttributeByOrnaments) {
        this.weaponAttributeByOrnaments = weaponAttributeByOrnaments;
    }
}
