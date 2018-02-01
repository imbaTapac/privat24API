package TestAPI.MobileTopUp;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Тарас on 07.11.2017.
 */
@XmlRootElement(name="request")
@XmlType(propOrder={"merchant", "data"})
public class MobileRequest {
    private Merchant merchant;

    private Data data;

    private String version;

    public Merchant getMerchant ()
    {
        return merchant;
    }

    public void setMerchant (Merchant merchant)
    {
        this.merchant = merchant;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }


    @Override
    public String toString()
    {
        return "[merchant = "+merchant+", data = "+data+", version = "+version+"]";
    }
}
