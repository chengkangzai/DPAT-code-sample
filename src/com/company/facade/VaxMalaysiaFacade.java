package com.company.facade;

import com.company.VaxMalaysia;
import com.company.builder.HTTPConnectionBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.List;

public class VaxMalaysiaFacade extends AbstractFacade<VaxMalaysia> {
    static String baseUrl = "https://raw.githubusercontent.com/CITF-Malaysia/citf-public/main/";
    static String vaxCSV = baseUrl + "vaccination/vax_malaysia.csv";

    @Override
    public List<VaxMalaysia> get() {
        try {
            HttpURLConnection conn = getConn();

            if (conn.getResponseCode() == 200) {
                InputStreamReader isr = new InputStreamReader(conn.getInputStream());
                BufferedReader br = new BufferedReader(isr);
                return br.lines().skip(1).map(VaxMalaysia::new).toList();
            }
            return super.get();
        } catch (IOException e) {
            return super.get();
        }
    }
    private HttpURLConnection getConn() throws IOException {
        return new HTTPConnectionBuilder().url(vaxCSV).build();
    }
}
