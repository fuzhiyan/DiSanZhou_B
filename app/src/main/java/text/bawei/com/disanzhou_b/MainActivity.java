package text.bawei.com.disanzhou_b;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_id;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initHandler();
        handler.sendEmptyMessageDelayed(0, 2000);

    }

    private void initHandler() {
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
                        text_id.setText("我在学习Android");
                        handler.sendEmptyMessageDelayed(1, 2000);
                        break;
                    case 1:

                        startActivity(new Intent(MainActivity.this, LoginActivity.class));

                        break;

                    default:
                        break;
                }
            }
        };

    }

    private void initView() {
        text_id = (TextView) findViewById(R.id.text_id);

    }


}
