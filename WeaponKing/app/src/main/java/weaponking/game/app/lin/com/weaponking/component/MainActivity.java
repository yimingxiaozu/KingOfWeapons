package weaponking.game.app.lin.com.weaponking.component;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import weaponking.game.app.lin.com.weaponking.R;
import weaponking.game.app.lin.com.weaponking.model.GameController;
import weaponking.game.app.lin.com.weaponking.model.GameMap;
import weaponking.game.app.lin.com.weaponking.model.*;
import weaponking.game.app.lin.com.weaponking.utils.CommonUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView txt_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        DisplayMetrics dm = getResources().getDisplayMetrics();
        int heigth = dm.heightPixels;
        int width = dm.widthPixels;
       /*txt_info = (TextView)findViewById(R.id.txt_main_info);
        //玩家1
        Force user1 = new Force("敢死队");
        user1.addWeapon(new IronSword());
        //玩家2
        Force user2 = new Force("干死队");
        user2.addWeapon(new IronSword());

        GameMap gameMap = new GameMap(7, 7);
        gameMap.addForce(user1);
        gameMap.addForce(user2);
        GameController gameController = new GameController(gameMap);
        txt_info.setText(user1.getForceInfo());*/
    }
}
