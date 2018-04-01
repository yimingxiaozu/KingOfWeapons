package weaponking.game.app.lin.com.weaponking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import weaponking.game.app.lin.com.weaponking.R;
import weaponking.game.app.lin.com.weaponking.model.IronSword;
import weaponking.game.app.lin.com.weaponking.model.Weapon;
import weaponking.game.app.lin.com.weaponking.utils.CommonUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Weapon sword1 = new IronSword();

        Weapon sword2 = new IronSword();

        sword1.attack(sword2);
        Log.d(TAG, CommonUtil.getWeaponAttributeInfo(sword1.getWeaponAttributePrimitive()));*/
    }
}
