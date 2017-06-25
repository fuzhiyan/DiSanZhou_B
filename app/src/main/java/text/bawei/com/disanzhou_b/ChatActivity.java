package text.bawei.com.disanzhou_b;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import text.bawei.com.disanzhou_b.adapter.Tab_Adapter;

public class ChatActivity extends AppCompatActivity {

    private ViewPager vp;
    private TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        initView();


    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);

        Tab_Adapter adapter = new Tab_Adapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        tab.setupWithViewPager(vp);
        tab.setTabMode(TabLayout.MODE_FIXED);
    }
}
