package weaponking.game.app.lin.com.weaponking.utils;

import weaponking.game.app.lin.com.weaponking.model.Damage;
import weaponking.game.app.lin.com.weaponking.model.WeaponAttribute;

/**
 * Created by lenovo on 2018/3/27.
 * 通用的工具类
 */

public class CommonUtil {
    /**
     * 获取weaponAttribute的信息
     * @param weaponAttribute
     * @return
     */
    public static String getWeaponAttributeInfo(WeaponAttribute weaponAttribute){
        if(weaponAttribute == null){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" MaxHP: " + weaponAttribute.getMaxHP());
        stringBuffer.append(" HP: " + weaponAttribute.getHP());
        stringBuffer.append(" Armour: " + weaponAttribute.getArmour());
        stringBuffer.append(" AwakeDistance: " + weaponAttribute.getAwakeDistance());
        if(weaponAttribute.getDamageType() == Damage.DAMAGE_TYPE.TYPE_HOLY){
            stringBuffer.append(" DamageType: TYPE_HOLY");
        }
        else if(weaponAttribute.getDamageType() == Damage.DAMAGE_TYPE.TYPE_MAGIC){
            stringBuffer.append(" DamageType: TYPE_MAGIC");
        }
        else if(weaponAttribute.getDamageType() == Damage.DAMAGE_TYPE.TYPE_PHYSICAL){
            stringBuffer.append(" DamageType: TYPE_PHYSICAL");
        }
        stringBuffer.append(" Dps: " + weaponAttribute.getDps());
        stringBuffer.append(" MagicDefense: " + weaponAttribute.getMagicDefense());
        stringBuffer.append(" Mana: " + weaponAttribute.getMana());
        stringBuffer.append(" MaxMana: " + weaponAttribute.getMaxMana());
        stringBuffer.append(" MovingDistance: " + weaponAttribute.getMovingDistance());
        return stringBuffer.toString();
    }
}
