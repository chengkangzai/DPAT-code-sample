package com.company.builder;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPConnectionBuilder {
    private String url;
    private String method = "GET";
    private int readTimeout = 15000;
    private int connectTimeout = 15000;
    private boolean useCaches = false;
    private String userAgent = "Mozilla/5.0";
    private String acceptCharset = "UTF-8";


    public HTTPConnectionBuilder url(String url) {
        this.url = url;
        return this;
    }

    public HTTPConnectionBuilder method(String method) {
        this.method = method;
        return this;
    }

    public HTTPConnectionBuilder readTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    public HTTPConnectionBuilder connectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    public HTTPConnectionBuilder useCaches(boolean useCaches) {
        this.useCaches = useCaches;
        return this;
    }

    public HTTPConnectionBuilder userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public HTTPConnectionBuilder acceptCharset(String acceptCharset) {
        this.acceptCharset = acceptCharset;
        return this;
    }

    public HttpURLConnection build() throws IOException {
        URL url = new URL(this.url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(this.method);
        conn.setRequestProperty("User-Agent", this.userAgent);
        conn.setRequestProperty("Accept-Charset", this.acceptCharset);
        conn.setReadTimeout(this.readTimeout);
        conn.setConnectTimeout(this.connectTimeout);
        conn.setUseCaches(this.useCaches);
        conn.connect();
        return conn;
    }
}

