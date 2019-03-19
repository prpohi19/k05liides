package com.company;

public class Main {
    public static void main(String[] arg) {
        Klass klass = new Klass();
        klass.arvuSisend(1);
        klass.tekstiSisend("sõna");
        klass.mituSisendit(1,2);
        klass.mituSisendit("karu", "püksid");
        klass.klassiFunktsioon();

        // Abstaktset klassi ei saa niisama välja kutsuda
        // AbstraktneKlass ak = new AbstraktneKlass();

        // küll aga saab seda teha siis, kui kõik selle funktsioonid on implementeeritud
        AbstraktneKlass ak = new AbstraktneKlass() {
            void tyhiFunktsioon() {
                System.out.println("Abstraktse klassi tühi funktsioon sai omale sisu!");
            }
        };

        ak.tyhiFunktsioon();

        // ja nüüd saab ka originaalse meetodi kätte
        ak.hangiArv();
    }
}


/*
Sa sisestasid arvu 1!
Sa sisestasid teksti 'sõna'!
See meetod liidab arve! 1+2=12
See meetod liidab sõnu! karu+püksid=karupüksid
Seda funktsiooni pole liideses!
Abstraktse klassi tühi funktsioon sai omale sisu!
Toimiv funktsioon abstraktses klassis. Antud klassi arv on 123
 */