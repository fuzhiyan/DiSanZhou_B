package text.bawei.com.disanzhou_b.bean;

/**
 * Created by 王占军
 * on 2017/6/24.
 * 类的用途:
 */

public class User {

    private String name;
    private String pwd;

    public User() {
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
