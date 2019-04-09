package createPattern.PrototypePattern;

/**
 * Created by cp
 * data  2019/4/9.
 * description
 */
public abstract class Shape implements Cloneable {
      String id;

      String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone()  {
        Object clone = null;
        try {
            clone = super.clone();
        } catch ( CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }
}
