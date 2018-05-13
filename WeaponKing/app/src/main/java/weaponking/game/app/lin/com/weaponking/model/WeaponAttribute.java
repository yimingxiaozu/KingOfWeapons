package weaponking.game.app.lin.com.weaponking.model;

/**
 * Created by lenovo on 2018/3/25.
 * 武器的属性
 */

public class WeaponAttribute extends BasicAttribute {

    private int maxHP;//血量上限
    private int HP;//血量
    private int dps;//攻击力
    private Damage.DAMAGE_TYPE damageType;//攻击的方式 魔法或者物理
    private int movingDistance;//能够移动的距离
    private int awakeDistance;//被唤醒的距离
    private int armour;//护甲
    private float magicDefense;//魔法抗性
    private int mana;//魔法值
    private int maxMana;//最大魔法值


    public WeaponAttribute(){
        setObjectType(OBJECT_TYPE.WEAPON);//类型为武器
        setCanAttack(true);//可以攻击
        setMovable(true);//是否能够移动
        setIsGod(false);//非无敌模式
    }

    /**
     * 获取复制品
     * @param weaponAttribute 要复制的属性
     */
    public WeaponAttribute(WeaponAttribute weaponAttribute){
        //设置基本属性
        setObjectType(weaponAttribute.getObjectType());
        setCanAttack(weaponAttribute.canAttack());
        setMovable(weaponAttribute.isMovable());
        setIsGod(weaponAttribute.isGod());

        setMaxHP(weaponAttribute.getMaxHP());
        setHP(weaponAttribute.getHP());
        setArmour(weaponAttribute.getArmour());
        setDamageType(weaponAttribute.getDamageType());
        setAwakeDistance(weaponAttribute.getAwakeDistance());//唤醒距离
        setDps(weaponAttribute.getDps());
        setMagicDefense(weaponAttribute.getMagicDefense());
        setMaxMana(weaponAttribute.getMaxMana());
        setMana(weaponAttribute.getMana());
        setMovingDistance(weaponAttribute.getMovingDistance());//移动距离为1
    }



    /**
     * 用此类来构造属性
     */
/*    public static class Builder{
        private WeaponAttribute weaponAttribute;
        public Builder(){
            weaponAttribute = new WeaponAttribute();
        }
        public Builder setMana(int mana) {
            weaponAttribute.mana = mana;
            return this;
        }
        public Builder setMaxMana(int maxMana) {
            weaponAttribute.maxMana = maxMana;
            return this;
        }
        public Builder setMaxHP(int maxHP) {
            weaponAttribute.maxHP = maxHP;
            return this;
        }
        public Builder setHP(int HP) {
            weaponAttribute.HP = HP;
            return this;
        }

        public Builder setDps(int dps) {
            weaponAttribute.dps = dps;
            return this;
        }
        public WeaponAttribute build(){
            return weaponAttribute;
        }
    }
    */


    public int getMana() {
        return mana;
    }

    public void setMana(int mana){
        this.mana = mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public Damage.DAMAGE_TYPE getDamageType() {
        return damageType;
    }

    public void setDamageType(Damage.DAMAGE_TYPE damageType) {
        this.damageType = damageType;
    }

    public int getMovingDistance() {
        return movingDistance;
    }

    public void setMovingDistance(int movingDistance) {
        this.movingDistance = movingDistance;
    }

    public int getAwakeDistance() {
        return awakeDistance;
    }

    public void setAwakeDistance(int awakeDistance) {
        this.awakeDistance = awakeDistance;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public float getMagicDefense() {
        return magicDefense;
    }

    public void setMagicDefense(float magicDefense) {
        this.magicDefense = magicDefense;
    }
}
