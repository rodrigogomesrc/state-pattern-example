package org.example;

import org.example.nopattern.Phone;
import org.example.state.PhoneContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Usando State");
        withPattern();
        System.out.println("\n\n");
        System.out.println("Sem usar State");
        withoutPattern();
    }

    public static void withPattern() {
        PhoneContext phoneContext = new PhoneContext();
        phoneContext.onPower();
        phoneContext.onHome();
        phoneContext.onUnlock();
        phoneContext.onLock();
        phoneContext.onUnlock();
        phoneContext.onHome();
        phoneContext.onPower();
    }

    public static void withoutPattern() {
        Phone phone = new Phone();
        phone.onPower();
        phone.onHome();
        phone.onUnlock();
        phone.onLock();
        phone.onUnlock();
        phone.onHome();
        phone.onPower();

    }
}