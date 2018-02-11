package prototype;

import java.io.Serializable;

public class Address implements Cloneable,Serializable {

    private static final long serialVersionUID =  783202091017893997L;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address(String description) {
        this.description = description;
    }

    @Override
    protected Address clone() throws CloneNotSupportedException {
        return (Address)super.clone();
    }

}
