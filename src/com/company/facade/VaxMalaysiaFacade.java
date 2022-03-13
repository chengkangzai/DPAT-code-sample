package com.company.facade;

import com.company.VaxMalaysia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class VaxMalaysiaFacade extends AbstractFacade<VaxMalaysia> {
    static String baseUrl = "https://raw.githubusercontent.com/CITF-Malaysia/citf-public/main/";
    static String vaxCSV = baseUrl + "vaccination/vax_malaysia.csv";

    @Override
    public List<VaxMalaysia> get() {
        try {
            URL url = new URL(vaxCSV);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            conn.setRequestProperty("Accept-Charset", "UTF-8");
            conn.setReadTimeout(15000);
            conn.setConnectTimeout(15000);
            conn.setUseCaches(true);
            conn.connect();

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
}
