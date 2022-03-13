package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

class VaxMalaysia {
    public String date;
    private Integer daily_partial;
    private Integer daily_full;
    private Integer daily_booster;
    private Integer daily;
    private Integer daily_partial_adol;
    private Integer daily_full_adol;
    private Integer daily_partial_child;
    private Integer daily_full_child;
    private Integer cumul_partial;
    private Integer cumul_full;
    private Integer cumul_booster;
    private Integer cumul;
    private Integer cumul_partial_adol;
    private Integer cumul_full_adol;
    private Integer cumul_partial_child;
    private Integer cumul_full_child;
    private Integer pfizer1;
    private Integer pfizer2;
    private Integer pfizer3;
    private Integer sinovac1;
    private Integer sinovac2;
    private Integer sinovac3;
    private Integer astra1;
    private Integer astra2;
    private Integer astra3;
    private Integer sinopharm1;
    private Integer sinopharm2;
    private Integer sinopharm3;
    private Integer cansino;
    private Integer cansino3;
    private Integer pending1;
    private Integer pending2;
    private Integer pending;

    public VaxMalaysia(String line) {
        String[] split = line.split(",");
        this.date = split[0];
        this.daily_partial = Integer.parseInt(split[1]);
        this.daily_full = Integer.parseInt(split[2]);
        this.daily_booster = Integer.parseInt(split[3]);
        this.daily = Integer.parseInt(split[4]);
        this.daily_partial_adol = Integer.parseInt(split[5]);
        this.daily_full_adol = Integer.parseInt(split[6]);
        this.daily_partial_child = Integer.parseInt(split[7]);
        this.daily_full_child = Integer.parseInt(split[8]);
        this.cumul_partial = Integer.parseInt(split[9]);
        this.cumul_full = Integer.parseInt(split[10]);
        this.cumul_booster = Integer.parseInt(split[11]);
        this.cumul = Integer.parseInt(split[12]);
        this.cumul_partial_adol = Integer.parseInt(split[13]);
        this.cumul_full_adol = Integer.parseInt(split[14]);
        this.cumul_partial_child = Integer.parseInt(split[15]);
        this.cumul_full_child = Integer.parseInt(split[16]);
        this.pfizer1 = Integer.parseInt(split[17]);
        this.pfizer2 = Integer.parseInt(split[18]);
        this.pfizer3 = Integer.parseInt(split[19]);
        this.sinovac1 = Integer.parseInt(split[20]);
        this.sinovac2 = Integer.parseInt(split[21]);
        this.sinovac3 = Integer.parseInt(split[22]);
        this.astra1 = Integer.parseInt(split[23]);
        this.astra2 = Integer.parseInt(split[24]);
        this.astra3 = Integer.parseInt(split[25]);
        this.sinopharm1 = Integer.parseInt(split[26]);
        this.sinopharm2 = Integer.parseInt(split[27]);
        this.sinopharm3 = Integer.parseInt(split[28]);
        this.cansino = Integer.parseInt(split[29]);
        this.cansino3 = Integer.parseInt(split[30]);
        this.pending1 = Integer.parseInt(split[31]);
        this.pending2 = Integer.parseInt(split[32]);
        this.pending = Integer.parseInt(split[33]);
    }


    @Override
    public String toString() {
        return "VaxMalaysia{" +
                "date=" + date +
                ", daily_partial=" + daily_partial +
                ", daily_full=" + daily_full +
                ", daily_booster=" + daily_booster +
                ", daily=" + daily +
                ", daily_partial_adol=" + daily_partial_adol +
                ", daily_full_adol=" + daily_full_adol +
                ", daily_partial_child=" + daily_partial_child +
                ", daily_full_child=" + daily_full_child +
                ", cumul_partial=" + cumul_partial +
                ", cumul_full=" + cumul_full +
                ", cumul_booster=" + cumul_booster +
                ", cumul=" + cumul +
                ", cumul_partial_adol=" + cumul_partial_adol +
                ", cumul_full_adol=" + cumul_full_adol +
                ", cumul_partial_child=" + cumul_partial_child +
                ", cumul_full_child=" + cumul_full_child +
                ", pfizer1=" + pfizer1 +
                ", pfizer2=" + pfizer2 +
                ", pfizer3=" + pfizer3 +
                ", sinovac1=" + sinovac1 +
                ", sinovac2=" + sinovac2 +
                ", sinovac3=" + sinovac3 +
                ", astra1=" + astra1 +
                ", astra2=" + astra2 +
                ", astra3=" + astra3 +
                ", sinopharm1=" + sinopharm1 +
                ", sinopharm2=" + sinopharm2 +
                ", sinopharm3=" + sinopharm3 +
                ", cansino=" + cansino +
                ", cansino3=" + cansino3 +
                ", pending1=" + pending1 +
                ", pending2=" + pending2 +
                ", pending=" + pending +
                '}';
    }
}

class VaxRegMalaysia {
    public String date;
    private String state;
    private Integer total;
    private Integer phase2;
    private Integer mysj;
    private Integer call;
    private Integer web;
    private Integer children;
    private Integer children_solo;
    private Integer adolescents;
    private Integer elderly;
    private Integer comorb;
    private Integer oku;

    public VaxRegMalaysia(String line) {
        String[] split = line.split(",");
        this.date = split[0];
        this.state = split[1];
        this.total = Integer.parseInt(split[2]);
        this.phase2 = Integer.parseInt(split[3]);
        this.mysj = Integer.parseInt(split[4]);
        this.call = Integer.parseInt(split[5]);
        this.web = Integer.parseInt(split[6]);
        this.children = Integer.parseInt(split[7]);
        this.children_solo = Integer.parseInt(split[8]);
        this.adolescents = Integer.parseInt(split[9]);
        this.elderly = Integer.parseInt(split[10]);
        this.comorb = Integer.parseInt(split[11]);
        this.oku = Integer.parseInt(split[12]);
    }

    @Override
    public String toString() {
        return "VaxRegMalaysia{" +
                "date=" + date +
                ", state='" + state + '\'' +
                ", total=" + total +
                ", phase2=" + phase2 +
                ", mysj=" + mysj +
                ", call=" + call +
                ", web=" + web +
                ", children=" + children +
                ", children_solo=" + children_solo +
                ", adolescents=" + adolescents +
                ", elderly=" + elderly +
                ", comorb=" + comorb +
                ", oku=" + oku +
                '}';
    }


}

public class Main {

    public static void main(String[] args) throws IOException {
        String baseurl = "https://raw.githubusercontent.com/CITF-Malaysia/citf-public/main/vaccination/vax_malaysia.csv";
        URL url = new URL(baseurl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        connection.setReadTimeout(15000);
        connection.setConnectTimeout(15000);
        connection.setUseCaches(true);
        connection.connect();

        if (connection.getResponseCode() == 200) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                List<VaxMalaysia> lines = br.lines().skip(1).map(VaxMalaysia::new).toList();
                System.out.println("----------------- [START] Print Malaysian Vaccination Status -----------------");
                lines.forEach(System.out::println);
                System.out.println("----------------- [END] Print Malaysian Vaccination Status -----------------");
                System.out.println("----------------- [START] Print Malaysian Vaccination Status on 2021-05-03 -----------------");
                lines.stream().filter(x -> x.date.equals("2021-05-03")).forEach(System.out::println);
                System.out.println("----------------- [END] Print Malaysian Vaccination Status on 2021-05-03 -----------------");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


        String baseurl2 = "https://raw.githubusercontent.com/CITF-Malaysia/citf-public/main/registration/vaxreg_malaysia.csv";
        URL url2 = new URL(baseurl2);
        HttpURLConnection connection2 = (HttpURLConnection) url2.openConnection();
        connection2.setRequestMethod("GET");
        connection2.setRequestProperty("User-Agent", "Mozilla/5.0");
        connection2.setRequestProperty("Accept-Charset", "UTF-8");
        connection2.setReadTimeout(15000);
        connection2.setConnectTimeout(15000);
        connection2.setUseCaches(true);
        connection2.connect();
        if (connection2.getResponseCode() == 200) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection2.getInputStream()));
                List<VaxRegMalaysia> lines = br.lines().skip(1).map(VaxRegMalaysia::new).toList();
                System.out.println("----------------- [START] Print Malaysian Registration Status -----------------");
                lines.forEach(System.out::println);
                System.out.println("----------------- [END] Print Malaysian Registration Status -----------------");
                System.out.println("----------------- [START] Print Malaysian Registration Status on 2021-10-03 -----------------");
                lines.stream().filter(x -> x.date.equals("2021-10-03")).forEach(System.out::println);
                System.out.println("----------------- [END] Print Malaysian Registration Status on 2021-10-03 -----------------");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
