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
        state.lock();
    }

    public void onUnlock() {
        state.unlock();
    }

    public void onHome() {
        state.home();
    }
}
