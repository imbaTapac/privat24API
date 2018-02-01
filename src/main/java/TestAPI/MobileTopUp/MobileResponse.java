package TestAPI.MobileTopUp;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Тарас on 07.11.2017.
 */
@XmlRootElement(name="response")
public class MobileResponse {
    private Merchant merchant;

    private DataResponse data;

    private String version;

    public Merchant getMerchant ()
    {
        return merchant;
    }

    public void setMerchant (Merchant merchant)
    {
        this.merchant = merchant;
    }

    public DataResponse getData ()
    {
        return data;
    }

    public void setData (DataResponse data)
    {
        this.data = data;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "[merchant = "+merchant+", data = "+data+", version = "+version+"]";
    }
}
