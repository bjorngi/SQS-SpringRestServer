package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {
    private final AtomicLong counter = new AtomicLong();
    private final String email = "bjorngi@tihlde.org";

    @RequestMapping("/accounts")
    public @ResponseBody Account account(
            @RequestParam(value="name", required=false, defaultValue="Bjorn") String name) {
        return new Account(counter.incrementAndGet(), name, email);
    }
}