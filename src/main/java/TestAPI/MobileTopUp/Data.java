package TestAPI.MobileTopUp;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Тарас on 08.11.2017.
 */
@XmlType(propOrder={"oper", "wait","test","payment"})
public class Data
{


    private String oper;

    private String test;

    private String wait;

    private Payment payment;



    public String getOper ()
    {
        return oper;
    }

    public void setOper (String oper)
    {
        this.oper = oper;
    }

    public String getTest ()
    {
        return test;
    }

    public void setTest (String test)
    {
        this.test = test;
    }

    public String getWait ()
    {
        return wait;
    }

    public void setWait (String wait)
    {
        this.wait = wait;
    }
    public Payment getPayment ()
    {
        return payment;
    }

    public void setPayment (Payment payment)
    {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "data{" +
                "oper='" + oper + '\'' +
                ", test='" + test + '\'' +
                ", wait='" + wait + '\'' +
                ", payment=" + payment +
                '}';
    }
}