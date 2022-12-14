package hello.springmvc.basic.requestmapping.requestmapping;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger((getClass()));

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    private String helloBasic() {
        log.info("basic");
        return "ok";
    }



}
