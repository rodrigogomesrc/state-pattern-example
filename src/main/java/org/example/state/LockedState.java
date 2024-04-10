package org.example.state;

public class LockedState extends PhoneState{
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public void onLock() {

    }

    @Override
    public void onUnlock() {

    }

    @Override
    public void onHome() {

    }
}
