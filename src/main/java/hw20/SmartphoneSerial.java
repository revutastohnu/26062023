package hw20;

import java.io.Serializable;

public class SmartphoneSerial implements Serializable {
    private static final long serialVersionUID = 1L;
    private final OS os;
    private String color;
    private  String type;

    public enum OS {
        iOS,
        ANDROID
    }

    public SmartphoneSerial(OS os, String color, String type) {
        System.out.println("invoke SmartphoneSerial constructor");
        this.os = os;
        this.color = color;
        this.type = type;
    }

    public OS getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public SmartphoneSerial clone() throws CloneNotSupportedException {
        return (SmartphoneSerial) super.clone();
    }

    @Override
    public String toString() {
        return "Smartphone {" +
                "OS='" + os + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
