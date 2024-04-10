package org.example.state;

public class PhoneContext {

    private PhoneState state;

    public PhoneContext() {
        this.state = new OffState(this);
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

    public void onPower() {
        state.power();
    }
}
