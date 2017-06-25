package text.bawei.com.disanzhou_b.bean;

/**
 * Created by 王占军
 * on 2017/6/24.
 * 类的用途:
 */

public class LiaoTianBean {

    private int pic;
    private String name;
    private String neirong;

    public LiaoTianBean(int pic, String name, String neirong) {
        this.pic = pic;
        this.name = name;
        this.neirong = neirong;
    }

    public LiaoTianBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
