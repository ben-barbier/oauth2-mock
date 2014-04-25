package hello;

public class TokenResponse {

    /*
    {
        "accessToken":"MzJmNDc3M2VjMmQzN",
        "tokenType":"bearer",
        "refreshToken":"RRRRR",
        "expiration":1398414684891
    }
    */

    private final String accessToken;
    private final String tokenType;
    private final String refreshToken;
    private final long expiration;

    public TokenResponse(String accessToken, String tokenType, String refreshToken, long expiration) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.refreshToken = refreshToken;
        this.expiration = expiration;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public long getExpiration() {
        return expiration;
    }

}
