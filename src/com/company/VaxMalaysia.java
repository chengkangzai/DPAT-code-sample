package com.company;

public class VaxMalaysia {
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
        if (line == null) {
            return;
        }

        String[] split = line.split(",");
        if (split.length != 34) {
            return;
        }

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
