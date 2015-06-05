package com.ocr.observador.events;


/**
 * Created by Vazh on 5/5/2015.
 */
public class RegisterUserEvent extends AbstractEvent {
    public enum Type {
        COMPLETED,
        STARTED
    }

    private int _resultCode;

    public RegisterUserEvent(Type type, int resultCode) {
        super(type);
        this._resultCode = resultCode;

    }

    public int getResultCode() {
        return _resultCode;
    }

}
