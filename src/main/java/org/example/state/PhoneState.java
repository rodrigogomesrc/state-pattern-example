package org.example.state;

public abstract class PhoneState {
    protected Phone phone;

    public PhoneState(Phone phone) {
        this.phone = phone;
    }

    public abstract void lock();
    public abstract void unlock();
    public abstract void home();
    public abstract void power();
}
