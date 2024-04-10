package org.example.state;

public class LockedState extends PhoneState{
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void lock() {
        System.out.println("Smartphone já bloqueado");
    }

    @Override
    public void unlock() {
        System.out.println("Desbloqueando smartphone");
        phone.setState(new ReadyState(phone));
    }

    @Override
    public void home() {
        System.out.println("Smartphone bloqueado. Desbloqueie primeiro");
    }

    @Override
    public void power() {
        System.out.println("Desligando a tela");
        phone.setState(new OffState(phone));
    }
}
