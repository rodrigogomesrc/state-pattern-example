package org.example.state;

public class ReadyState extends PhoneState {

    public ReadyState(PhoneContext phoneContext) {
        super(phoneContext);
    }

    @Override
    public void lock() {
        System.out.println("Bloqueando smartphone");
        phoneContext.setState(new LockedState(phoneContext));
    }

    @Override
    public void unlock() {
        System.out.println("Smartphone já desbloqueado");
    }

    @Override
    public void home() {
        System.out.println("Smartphone já na Home");
    }

    @Override
    public void power() {
        System.out.println("Desligando a tela");
        phoneContext.setState(new OffState(phoneContext));
    }
}
