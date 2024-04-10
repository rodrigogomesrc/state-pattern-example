package org.example.state;

public abstract class PhoneState {
    protected Phone phone;

    public PhoneState(Phone phone) {
        this.phone = phone;
    }

    public abstract void onLock();
    public abstract void onUnlock();
    public abstract void onHome();
}
