package ru.mirea.lab_19.task1;

import java.math.BigInteger;

public class InnNotValidException extends Exception{
    private final BigInteger innNum;

    public InnNotValidException(BigInteger innNum){
        super("НЕВЕРНЫЙ номер ИНН: " + innNum);
        this.innNum = innNum;
    }

    public BigInteger getInnNum() {
        return innNum;
    }
}
