package org.example.nopattern;

public class Phone {

    private EnumState state;

    public Phone() {
        this.state = EnumState.OFF;
    }

    public void onLock() {
        switch (state) {
            case OFF:
                System.out.println("Tela desligada. Não é possível bloquear");
                break;
            case LOCKED:
                System.out.println("Smartphone já bloqueado");
                break;
            case READY:
                System.out.println("Bloqueando smartphone");
                state = EnumState.LOCKED;
                break;
        }
    }

    public void onUnlock() {
        switch (state) {
            case OFF:
                System.out.println("Tela desligada. Não é possível desbloquear");
                break;
            case LOCKED:
                System.out.println("Desbloqueando smartphone");
                state = EnumState.READY;
                break;
            case READY:
                System.out.println("Smartphone já desbloqueado");
                break;
        }
    }

    public void onHome() {
        switch (state) {
            case OFF:
                System.out.println("Ligando a tela");
                break;
            case LOCKED:
                System.out.println("Smartphone bloqueado. Desbloqueie primeiro");
                break;
            case READY:
                System.out.println("Smartphone já na Home");
                break;

        }
    }

    public void onPower() {
        switch (state) {
            case OFF:
                System.out.println("Ligando a tela");
                state = EnumState.LOCKED;
                break;
            case LOCKED:
                System.out.println("Desligando a tela");
                state = EnumState.OFF;
                break;
            case READY:
                System.out.println("Desligando a tela");
                break;

        }
    }

}
