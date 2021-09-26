package org.launchcode.studio7;

public class BaseDisc {
    private String name;
    private int dataCapacity;
    private String dataType;
    private int discSpeed;
    private  String discType;

    public BaseDisc(String name, int dataCapacity, String dataType, int discSpeed, String discType) {
        this.name = name;
        this.dataCapacity = dataCapacity;
        this.dataType = dataType;
        this.discSpeed = discSpeed;
        this.discType = discType;
    }

    public String discInfo(){
        String output = String.format("Disc Name: %s \nData Capacity: %d \nData TYpe : %s \nDisc Speed: %d \nDisc Type %s",name,
                dataCapacity,dataType, discSpeed,discType);
        return output;
    }
    public String writeData(int dataToWrite){
        return "Data Written to Disc";
    }
}
