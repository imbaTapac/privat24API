package TestAPI.Controller;

import TestAPI.MobileTopUp.MobileRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Тарас on 08.11.2017.
 */
public class MainController {

    private static final String id="131137";
    private static final String signature="RsjD85YD3scAeaPSadJYiL45O42yq2WM";
    @RequestMapping(method = RequestMethod.POST)
    public void pay(){


    }
}
