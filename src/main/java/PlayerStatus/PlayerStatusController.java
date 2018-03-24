package PlayerStatus;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PlayerStatusController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/playerAccounts")
    public PlayerAccount playerAccount(@RequestParam(value = "username", defaultValue="TestAccount") String username){
        return new PlayerAccount(counter.incrementAndGet(),
                 String.format(template,username));
    }


}
