package org.example.state;

public abstract class PhoneState {
    protected PhoneContext phoneContext;

    public PhoneState(PhoneContext phoneContext) {
        this.phoneContext = phoneContext;
    }

    public abstract void lock();
    public abstract void unlock();
    public abstract void home();
    public abstract void power();
}
