package org.example.state;

public class OffState extends PhoneState {

    public OffState(PhoneContext phoneContext) {
        super(phoneContext);
    }

    @Override
    public void lock() {
        System.out.println("Tela desligada. Não é possível bloquear");
    }

    @Override
    public void unlock() {
        System.out.println("Tela desligada. Não é possível desbloquear");
    }

    @Override
    public void home() {
        System.out.println("Ligando a tela");
        phoneContext.setState(new LockedState(phoneContext));
    }

    @Override
    public void power() {
        System.out.println("Ligando a tela");
        phoneContext.setState(new LockedState(phoneContext));
    }
}
