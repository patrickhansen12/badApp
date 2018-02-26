package Model;

/**
 * Created by patrick on 29-01-2018.
 */



public class HWLogicSimple implements IHWLogic {
    @Override
    public String getGreeting(String value1) {
        return "Hello " + value1 + " - have a nice day - refactored!";
    }
    public String getPlus(String plus) {
        return "+";
    }

    @Override
    public String getMinus(String minus) {
        return "-";
    }

}