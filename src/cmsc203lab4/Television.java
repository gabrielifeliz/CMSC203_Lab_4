package cmsc203lab4;

/**
 *The purpose of this class is to model a television
 * Gabriel I Feliz
 * 09/17/2018
 */

public class Television {

    /**
     * The data field MANUFACTURER is the brand name, which is constant once the television is created
     */
    private final String MANUFACTURER;

    /**
     * The data field SCREEN_SIZE is the size of the television screen, which is constant once the television is created
     */
    private final int SCREEN_SIZE;

    /**
     * The data field powerOn holds value true if the power is on, and false if the power is off
     */
    private boolean powerOn;

    /**
     * The data field channel holds value of the station that the television is showing
     */
    private int channel;

    /**
     * The data field volume holds number value representing the loudness (0 being no sound)
     */
    private int volume;

    /**
     * The constructor initializes a turned off television with default channel and volume
     * @param brand The brand name of the television
     * @param size The size of the television screen
     */
    public Television(String brand, int size) {
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        channel = 2;
        volume = 20;
    }

    /**
     * The getVolume method returns the current volume of the television
     * @return The volume of the television
     */
    public int getVolume() {
        return volume;
    }

    /**
     * The getChannel method returns the current channel of the television
     * @return The channel of the television
     */
    public int getChannel() {
        return channel;
    }

    /**
     * The getManufacturer method returns the brand name of the television
     * @return The brand name of the television
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * The getScreenSize method returns the brand name of the television
     * @return The screen size of the television
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     * The setChannel method sets a value to data field channel passed by the parameter
     * @param station The channel the television will be changed to
     */
    public void setChannel(int station) {
        channel = station;
    }

    /**
     * The power method turns the television on and off
     */
    public void power() {
        powerOn = !powerOn;
    }

    /**
     * The increaseVolume method increases the volume of the television by one
     */
    public void increaseVolume() {
        volume++;
    }

    /**
     * The decreaseVolume method decreases the volume of the television by one
     */
    public void decreaseVolume() {
        volume--;
    }

}