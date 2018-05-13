package weaponking.game.app.lin.com.weaponking.model;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/25.
 * 伤害
 */

public  class Damage {

    public enum DAMAGE_TYPE{
        TYPE_PHYSICAL, //物理伤害
        TYPE_MAGIC, //魔法伤害
        TYPE_HOLY //神圣伤害
    }

    private Weapon fromWeapon;//造成伤害的武器
    private Weapon toWeapon;//被伤害的武器

    private DAMAGE_TYPE damageType;//伤害模式

    private int damage;//伤害数值

    //暴击作用于物理伤害
    private float proCriticalHit;//暴击概率
    private float mulCriticalHit;//暴击倍数

    //法球效果, 攻击时附加buff
    private ArrayList<WeaponAttributeDecorator> buffs;

    public Weapon getFromWeapon() {
        return fromWeapon;
    }

    public void setFromWeapon(Weapon fromWeapon) {
        this.fromWeapon = fromWeapon;
    }

    public Weapon getToWeapon() {
        return toWeapon;
    }

    public void setToWeapon(Weapon toWeapon) {
        this.toWeapon = toWeapon;
    }

    public DAMAGE_TYPE getDamageType() {
        return damageType;
    }

    public void setDamageType(DAMAGE_TYPE damageType) {
        this.damageType = damageType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getProCriticalHit() {
        return proCriticalHit;
    }

    public void setProCriticalHit(float proCriticalHit) {
        this.proCriticalHit = proCriticalHit;
    }

    public float getMulCriticalHit() {
        return mulCriticalHit;
    }

    public void setMulCriticalHit(float mulCriticalHit) {
        this.mulCriticalHit = mulCriticalHit;
    }

    public ArrayList<WeaponAttributeDecorator> getBuffs() {
        return buffs;
    }

    public void setBuffs(ArrayList<WeaponAttributeDecorator> buffs) {
        this.buffs = buffs;
    }
}
