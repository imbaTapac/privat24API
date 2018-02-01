package TestAPI.MobileTopUp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by Тарас on 19.11.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Prop {

    @XmlAttribute
    private String name;

    @XmlAttribute
    private String value;


    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }



    @Override
    public String toString()
    {
        return "[name = "+name+", value = "+value+"]";
    }
}
