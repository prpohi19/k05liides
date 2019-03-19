package com.company;

public class Klass implements Liides {
    public void arvuSisend(int arv) {
        System.out.println("Sa sisestasid arvu " + arv + "!");
    }

    public void tekstiSisend(String tekst) {
        System.out.println("Sa sisestasid teksti '" + tekst + "'!");
    }

    public void mituSisendit(int arv1, int arv2) {
        System.out.println("See meetod liidab arve! " + arv1 + "+" + arv2 + "=" + arv1 + arv2);
    }

    public void mituSisendit(String tekst1, String tekst2) {
        System.out.println("See meetod liidab sõnu! " + tekst1 + "+" + tekst2 + "=" + tekst1 + tekst2);
    }

    public void klassiFunktsioon() {
        System.out.println("Seda funktsiooni pole liideses!");
    }
}
