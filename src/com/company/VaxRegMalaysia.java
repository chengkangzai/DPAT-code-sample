package com.company;

public class VaxRegMalaysia {
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
