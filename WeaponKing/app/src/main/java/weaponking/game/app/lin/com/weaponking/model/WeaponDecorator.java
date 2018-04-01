package weaponking.game.app.lin.com.weaponking.model;

/**
 * Created by lenovo on 2018/3/27.
 * 武器修饰类，用于动态添加武器的功能, 比如武器的特效
 */

public abstract class WeaponDecorator extends Weapon {
      private Weapon weapon;//修饰的武器
     public void setWeapon(Weapon weapon){
         this.weapon = weapon;
     }
}
