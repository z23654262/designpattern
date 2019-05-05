package com.sixtwo.behavior.memento;

public interface Prototype extends Cloneable{
    public Object clone() throws CloneNotSupportedException;
}
