package TestAPI.MobileTopUp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by Тарас on 19.11.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment {

    @XmlAttribute
    private String id;

    private List<Prop> prop;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public List<Prop> getProp() {
        return prop;
    }

    public void setProp(List<Prop> prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "payment{" +
                "id='" + id + '\'' +
                ", prop=" + prop +
                '}';
    }
}
