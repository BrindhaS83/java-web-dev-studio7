package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String name, int dataCapacity, String dataType, int discSpeed, String discType)
    {
        super(name, dataCapacity, dataType,discSpeed,discType);
    }

    @Override
    public void spinDisc(){

        System.out.println("A CD spins at a rate of 200-500 rpm");
    }

    @Override
    public void readData(){
        System.out.println("Reading Data!!!");
    }

}
