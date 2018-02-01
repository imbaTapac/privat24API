package TestAPI.MobileTopUp;

/**
 * Created by Тарас on 02.12.2017.
 */
public class DataResponse {
    private PaymentResponse payment;

    private String oper;

    public PaymentResponse getPayment ()
    {
        return payment;
    }

    public void setPayment (PaymentResponse payment)
    {
        this.payment = payment;
    }

    public String getOper ()
    {
        return oper;
    }

    public void setOper (String oper)
    {
        this.oper = oper;
    }

    @Override
    public String toString()
    {
        return "[payment = "+payment+", oper = "+oper+"]";
    }
}
