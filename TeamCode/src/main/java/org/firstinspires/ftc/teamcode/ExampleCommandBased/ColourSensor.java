package org.firstinspires.ftc.teamcode.ExampleCommandBased;
import android.graphics.Color;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.hardware.rev.RevColorSensorV3;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class ColourSensor extends SubsystemBase {

    RevColorSensorV3 colourSensor;

    public ColourSensor(HardwareMap hrdware) {

        colourSensor = hrdware.get(RevColorSensorV3.class, "Colour Detector"); //simple hardware mapping

        colourSensor.enableLed(true);
    }

    public boolean isGreen() {
        int red = colourSensor.red(); //when teh camera scans for RGB, it returns a number value. Purple is red+blue, and green is green (duh). If the green number is more than the others, it should be green.
        int blue = colourSensor.blue();
        int green = colourSensor.green();

        return green > red && green > blue; //If it's more green then red/blue(which makes purple), it's green
    }
}

