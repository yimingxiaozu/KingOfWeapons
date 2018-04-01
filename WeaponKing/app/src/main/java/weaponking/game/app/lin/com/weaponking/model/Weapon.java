package weaponking.game.app.lin.com.weaponking.model;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/25.
 * 武器抽象类，定义基本的属性和方法
 */

public abstract class Weapon extends  BasicObject{

    private WeaponAttribute weaponAttributePrimitive;//该武器的原始属性

    private WeaponAttribute weaponAttributeFinal;//加上各种buff和饰品最后的属性

    private ArrayList<WeaponAttribute> buffAttribute;//该武器被添加的buff

    private ArrayList<Ability> abilities;//拥有的技能

    private ArrayList<Ornament> ornaments;//拥有的饰品

    /**
     * 获取被饰品修饰过后的武器属性
     * @return
     */
    public WeaponAttribute getDecoratedByOrnamentsAttribute(){
        //获取饰品的属性加成
        ArrayList<Ornament> ornaments = getOrnaments();
        WeaponAttribute attribute = getWeaponAttributePrimitive();
        if(ornaments != null){
            for(Ornament ornament : getOrnaments()){
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

    public ArrayList<WeaponAttribute> getBuffAttribute() {
        return buffAttribute;
    }

    public void setBuffAttribute(ArrayList<WeaponAttribute> buffAttribute) {
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
}
