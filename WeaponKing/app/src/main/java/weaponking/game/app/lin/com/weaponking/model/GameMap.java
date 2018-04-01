package weaponking.game.app.lin.com.weaponking.model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by lenovo on 2018/3/25.
 * 游戏地图类
 */

public class GameMap extends  BasicObject{

    private int mapWidth;//地图宽度
    private int mapHeight;//地图高度

    private int widthBlockNum;//横向方块数
    private int heightBlockNum;//竖直方块数

    private int widthBlock;//一个方块的宽度
    private int heightBlock;//一个方块的高度

    private Drawable background;//背景图片

    private ArrayList<Force> forces;//地图中的军队


    /**
     * 绘制地图
     */
    @Override
    public void draw() {

    }
}
