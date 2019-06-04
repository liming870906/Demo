package cn.com.tarena.demo;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar tool;
    private DrawerLayout layout;
    private FrameLayout fLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tool = (Toolbar) this.findViewById(R.id.app_bar);
        layout = (DrawerLayout) this.findViewById(R.id.layout);
        fLayout = (FrameLayout) this.findViewById(R.id.flayout);
//        tool.setLogo(R.mipmap.ic_launcher);
//        tool.setLogo(R.mipmap.ic_launcher);
        tool.setTitle("ToolBar");
        tool.setNavigationIcon(android.R.drawable.dialog_holo_light_frame);
        setSupportActionBar(tool);
        tool.setLogoDescription("nihao");
        tool.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Navigation",Toast.LENGTH_LONG).show();
                if (layout.isDrawerOpen(fLayout)){
                    layout.closeDrawer(fLayout);
                }else{
                    layout.openDrawer(fLayout);
                }
            }
        });
        //111122
        //添加测试数据Git测试
        //有添加了一行已经缓存的文件
        //有添加了一
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item){
            Toast.makeText(this, "Setting", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
