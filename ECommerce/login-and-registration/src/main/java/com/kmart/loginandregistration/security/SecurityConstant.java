package com.kmart.loginandregistration.security;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 1000000;
    public static final String TOKEN_PREFIX = "token";
    public static final String HEADER_STRING = "Authorization";
    public static final String TOKEN_SECRET = "1212";
    public static final String[] REGISTRATION_URL = {  "/users" };
    public static final String[] SIGN_OUT_URL = { "/users/user/logout" };
	public static final String[] SIGN_IN_URL = { "/login"};
}
