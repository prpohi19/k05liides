package com.company;

abstract class AbstraktneKlass {
    int arv = 123;

    void hangiArv(){
        System.out.println("Toimiv funktsioon abstraktses klassis. Antud klassi arv on " + arv);
    }

    abstract void tyhiFunktsioon();
}
