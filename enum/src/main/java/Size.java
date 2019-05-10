/**
 * Created by Arrome on 2019/4/27.
 */
public enum Size {
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");

    private String desc;

    //构造方法必须是private
    private Size(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }


    @Override
    public String toString() {
        return desc;
    }
}
