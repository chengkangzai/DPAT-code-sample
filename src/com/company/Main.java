package com.company;

import com.company.facade.VaxMalaysiaFacade;
import com.company.facade.VaxRegMalaysiaFacade;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<VaxMalaysia> lines = new VaxMalaysiaFacade().get();
        System.out.println("[START]\tPrint Malaysian Vaccination Status");
        lines.stream().limit(5).forEach(System.out::println);
        System.out.println("omitted...");
        System.out.println("[END]\tPrint Malaysian Vaccination Status");
        System.out.println("[START]\tPrint Malaysian Vaccination Status on 2021-05-03");
        lines.stream().filter(x -> x.date.equals("2021-05-03")).forEach(System.out::println);
        System.out.println("[END]\tPrint Malaysian Vaccination Status on 2021-05-03");

        List<VaxRegMalaysia> line2 = new VaxRegMalaysiaFacade().get();
        System.out.println("[START]\tPrint Malaysian Registration Status");
        line2.stream().limit(5).forEach(System.out::println);
        System.out.println("omitted...");
        System.out.println("[END]\tPrint Malaysian Registration Status");
        System.out.println("[START]\tPrint Malaysian Registration Status on 2021-10-03");
        line2.stream().filter(x -> x.date.equals("2021-10-03")).forEach(System.out::println);
        System.out.println("[END]\tPrint Malaysian Registration Status on 2021-10-03");
    }
}

