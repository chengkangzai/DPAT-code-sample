package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Main {
    static String baseUrl = "https://raw.githubusercontent.com/CITF-Malaysia/citf-public/main/";
    static String vaxCSV = baseUrl + "vaccination/vax_malaysia.csv";
    static String vaxRegCSV = baseUrl + "registration/vaxreg_malaysia.csv";

    public static void main(String[] args) throws IOException {
        URL url = new URL(vaxCSV);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        conn.setReadTimeout(15000);
        conn.setConnectTimeout(15000);
        conn.setUseCaches(true);
        conn.connect();

        if (conn.getResponseCode() == 200) {
            InputStreamReader isr = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            List<VaxMalaysia> lines = br.lines().skip(1).map(VaxMalaysia::new).toList();
            System.out.println("[START]\tPrint Malaysian Vaccination Status");
            lines.forEach(System.out::println);
            System.out.println("[END]\tPrint Malaysian Vaccination Status");
            System.out.println("[START]\tPrint Malaysian Vaccination Status on 2021-05-03");
            lines.stream().filter(x -> x.date.equals("2021-05-03")).forEach(System.out::println);
            System.out.println("[END]\tPrint Malaysian Vaccination Status on 2021-05-03");

        }


        URL url2 = new URL(vaxRegCSV);
        HttpURLConnection conn2 = (HttpURLConnection) url2.openConnection();
        conn2.setRequestMethod("GET");
        conn2.setRequestProperty("User-Agent", "Mozilla/5.0");
        conn2.setRequestProperty("Accept-Charset", "UTF-8");
        conn2.setReadTimeout(15000);
        conn2.setConnectTimeout(15000);
        conn2.setUseCaches(true);
        conn2.connect();
        if (conn2.getResponseCode() == 200) {
            InputStreamReader isr = new InputStreamReader(conn2.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            List<VaxRegMalaysia> lines = br.lines().skip(1).map(VaxRegMalaysia::new).toList();
            System.out.println("[START]\tPrint Malaysian Registration Status");
            lines.forEach(System.out::println);
            System.out.println("[END]\tPrint Malaysian Registration Status");
            System.out.println("[START]\tPrint Malaysian Registration Status on 2021-10-03");
            lines.stream().filter(x -> x.date.equals("2021-10-03")).forEach(System.out::println);
            System.out.println("[END]\tPrint Malaysian Registration Status on 2021-10-03");
        }
    }
}
