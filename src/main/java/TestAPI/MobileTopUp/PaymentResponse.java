package TestAPI.MobileTopUp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by Тарас on 02.12.2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentResponse {
    @XmlAttribute
    private String id;
    @XmlAttribute
    private String message;
    @XmlAttribute
    private String ref;
    @XmlAttribute
    private String amt;
    @XmlAttribute
    private String ccy;
    @XmlAttribute
    private String auto_id;
    @XmlAttribute
    private String comis;
    @XmlAttribute
    private String state;
    @XmlAttribute
    private String code;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getRef ()
    {
        return ref;
    }

    public void setRef (String ref)
    {
        this.ref = ref;
    }

    public String getAmt ()
    {
        return amt;
    }

    public void setAmt (String amt)
    {
        this.amt = amt;
    }

    public String getCcy ()
    {
        return ccy;
    }

    public void setCcy (String ccy)
    {
        this.ccy = ccy;
    }

    public String getAuto_id ()
    {
        return auto_id;
    }

    public void setAuto_id (String auto_id)
    {
        this.auto_id = auto_id;
    }

    public String getComis ()
    {
        return comis;
    }

    public void setComis (String comis)
    {
        this.comis = comis;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return "[id = "+id+", message = "+message+", ref = "+ref+", amt = "+amt+", ccy = "+ccy+", auto_id = "+auto_id+", comis = "+comis+", state = "+state+", code = "+code+"]";
    }
}
