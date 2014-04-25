package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class OAuthController {

    /*
        http://localhost:8080/oauth2/token?
        grant_type=client_credentials&
        client_id=adeoModile&
        client_secret=123456&
        scope=move_ADEO
    */

    private static final long UNE_HEURE = 1 * 60 * 60 * 1000;

    @RequestMapping("/oauth2/token")
    public @ResponseBody
    TokenResponse clientCredentials(
        @RequestParam(value="grant_type") String grant_type,
        @RequestParam(value="client_id") String client_id,
        @RequestParam(value="client_secret") String client_secret,
        @RequestParam(value="scope") String scope
    ) {

        System.out.println(String.format("Params : grant_type=%s ; client_id=%s ; client_secret=%s ; scope=%s", grant_type, client_id, client_secret, scope));

        String accessToken = "MzJmNDc3M2VjMmQzN";
        String tokenType = "bearer";
        String refreshToken = "ARmGDc3M2VjBmXxX";
        long expiration = getExpirationDate();

        return new TokenResponse(accessToken, tokenType, refreshToken, expiration);
    }

    private long getExpirationDate() {
        return new Date().getTime() + UNE_HEURE;
    }

}