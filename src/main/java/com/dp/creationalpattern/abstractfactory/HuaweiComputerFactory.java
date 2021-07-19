package com.dp.creationalpattern.abstractfactory;

public class HuaweiComputerFactory implements ComputerFactory{
    @Override
    public Disk createDisk() {
        return new HuaweiDisk();
    }

    @Override
    public Screen createScreen() {
        return new HuaweiScreen();
    }
}
