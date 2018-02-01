package TestAPI.MobileTopUp;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Тарас on 08.11.2017.
 */
public class Merchant
{
    private String id;

    private String signature;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getSignature ()
    {
        return signature;
    }

    public void setSignature (String signature)
    {
        this.signature = signature;
    }

    @Override
    public String toString()
    {
        return "[id = "+id+", signature = "+signature+"]";
    }
}
