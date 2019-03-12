package com.leskivprod.annotations;

public class PerformerMaximilian implements IPerformer {

    public void perform() throws Exception {
        System.out.println("Performer Maximilian throws an exception for no reason");
        throw new Exception();
    }
}