package org.example.state;

public class OffState extends PhoneState {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public void lock() {
        System.out.println("Tela desligada. Não é possível bloquear");
    }

    @Override
    public void unlock() {

    }

    @Override
    public void home() {

    }

    @Override
    public void power() {

    }
}
