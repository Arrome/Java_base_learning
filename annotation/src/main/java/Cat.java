/**
 * Created by Arrome on 2019/4/26.
 */
@Info(name = "kaka",like = {"鱼","肉"},color = Color.GREEN)
public class Cat {
    private String name;
    private int info;
    private String[] like;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public String[] getLike() {
        return like;
    }

    public void setLike(String[] like) {
        this.like = like;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
