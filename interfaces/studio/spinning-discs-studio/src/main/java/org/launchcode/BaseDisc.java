package org.launchcode;

import java.util.ArrayList;

public abstract class BaseDisc {
    private final String name;
    private final int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;


    public BaseDisc(String name, int maxCapacity, String aType, int someUsedCapacity) {
        this.name = name;
        storageCapacity = maxCapacity;
        discType = aType;
        capacityUsed = checkCapacity(someUsedCapacity);
        remainingCapacity = spaceLeft();
    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String diskInfo() {
        return String.format("\nDisk Name: %s\nMax Capacity: %d" + "\nSpace Used: %d" +
                "\nAvailable space: %d\n", name, storageCapacity, capacityUsed, remainingCapacity);
    }

    public String writeData(int dataSize){
        if( dataSize > remainingCapacity){
            return "Not enough disc space!";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "data written to disc. Remaining space = " + remainingCapacity;
    }



}


