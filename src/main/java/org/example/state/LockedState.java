package org.example.state;

public class LockedState extends PhoneState{
    public LockedState(PhoneContext phoneContext) {
        super(phoneContext);
    }

    @Override
    public void lock() {
        System.out.println("Smartphone já bloqueado");
    }

    @Override
    public void unlock() {
        System.out.println("Desbloqueando smartphone");
        phoneContext.setState(new ReadyState(phoneContext));
    }

    @Override
    public void home() {
        System.out.println("Smartphone bloqueado. Desbloqueie primeiro");
    }

    @Override
    public void power() {
        System.out.println("Desligando a tela");
        phoneContext.setState(new OffState(phoneContext));
    }
}
