package org.example.state;

public class Phone {

    private PhoneState state;

    public Phone() {
        this.state = new LockedState(this);
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void onLock() {
        state.onLock();
    }

    public void onUnlock() {
        state.onUnlock();
    }

    public void onHome() {
        state.onHome();
    }
}
