package text.bawei.com.disanzhou_b;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import text.bawei.com.disanzhou_b.bean.User;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText username;
    private EditText pwd;
    private Button denglu;
    private Button zhuce;
    private ArrayList<User> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        username = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.pwd);
        denglu = (Button) findViewById(R.id.denglu);
        zhuce = (Button) findViewById(R.id.zhuce);

        denglu.setOnClickListener(this);
        zhuce.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.denglu:

                denglu();

                break;
            case R.id.zhuce:
                submit();

                break;
        }
    }

    private void submit() {
        // validate
        String usernameString = username.getText().toString().trim();
        if (TextUtils.isEmpty(usernameString)) {
            Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        String pwdString = pwd.getText().toString().trim();
        if (TextUtils.isEmpty(pwdString)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        if (usernameString.length() < 6) {
            Toast.makeText(LoginActivity.this, "账号输入的字符请在6-10之间", Toast.LENGTH_SHORT).show();
            return;
        }

        if (pwdString.length() < 6) {
            Toast.makeText(LoginActivity.this, "密码输入的字符请在6-10之间", Toast.LENGTH_SHORT).show();
            return;
        }

        list = new ArrayList<>();
        User u = new User(usernameString, pwdString);
        list.add(u);

        Toast.makeText(LoginActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
       /* username.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
      */

    }

    public void denglu() {

        boolean bo = false;
        if (list == null) {
            Toast.makeText(LoginActivity.this, "无注册信息", Toast.LENGTH_SHORT).show();
            return;
        } else {
            for (int x = 0; x < list.size(); x++) {
                if (username.getText().toString().trim().equals(list.get(x).getName())
                        && pwd.getText().toString().trim().equals(list.get(x).getPwd())) {
                    bo = true;
                }
            }
            if (bo) {
                startActivity(new Intent(LoginActivity.this, ChatActivity.class));

            } else {
                Toast.makeText(LoginActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
                return;
            }

        }


    }


}
