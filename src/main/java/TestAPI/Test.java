package TestAPI;

import TestAPI.MobileTopUp.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import sun.misc.BASE64Encoder;
import sun.security.provider.MD5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Тарас on 08.11.2017.
 */
public class Test {
    private static final String id="Your id";
    private static final String merchantPass="Your merchantPass";
    public static void main(String[] args) throws IOException {
        String filename="C:\\Users\\Тарас\\Desktop\\Private24API\\test.xml";
        String filename1="C:\\Users\\Тарас\\Desktop\\Private24API\\response.xml";
        String url="https://api.privatbank.ua/p24api/directfill";
        List <Prop> props = new ArrayList<>();

        Prop prop1 = new Prop();
        prop1.setName("phone");
        prop1.setValue("Your phone number");

        Prop prop2 = new Prop();
        prop2.setName("amt");
        prop2.setValue("1");
        props.add(prop1);
        props.add(prop2);

        Payment payment = new Payment();
        payment.setId("");
        payment.setProp(props);

        Data data = new Data();
        data.setOper("cmt");
        data.setTest("1");
        data.setWait("1");
        data.setPayment(payment);

        Merchant merchant = new Merchant();
        merchant.setId(id);
        String sing = new ShaPasswordEncoder().encodePassword(new Md5PasswordEncoder().encodePassword(merchantPass,null),null);
       
        merchant.setSignature(sign);
        
        MobileRequest request = new MobileRequest();
        request.setMerchant(merchant);
        request.setData(data);
        convertObjectToXml(request,filename);
        try {
            URL url1 = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/xml");

            OutputStream os = connection.getOutputStream();
            // Write your XML to the OutputStream (JAXB is used in this example)
            JAXBContext context = JAXBContext.newInstance(MobileRequest.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(request,os);
            os.flush();
            System.out.println(os.toString());
            connection.getResponseCode();
            System.out.println(connection.getResponseCode());
            InputStream os1 = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(os1));
            String line;
            StringBuilder result = new StringBuilder();
            while((line = reader.readLine()) != null) {
                result.append(line);
            }
            System.out.println(result.toString());
            connection.disconnect();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void convertObjectToXml(MobileRequest request, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(MobileRequest.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // маршаллинг объекта в файл
            marshaller.marshal(request,new File(filePath));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    private static void convertObjectToXml1(MobileRequest request, OutputStream os) {
        try {
            JAXBContext context = JAXBContext.newInstance(MobileRequest.class);
            Marshaller marshaller = context.createMarshaller();
            // устанавливаем флаг для читабельного вывода XML в JAXB
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // маршаллинг объекта в файл
            marshaller.marshal(request,os);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}

