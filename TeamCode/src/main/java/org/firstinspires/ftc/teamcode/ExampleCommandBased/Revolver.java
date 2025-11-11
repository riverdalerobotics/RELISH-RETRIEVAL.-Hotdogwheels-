package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.barrelConstants.POSITION_ONE;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.barrelConstants.POSITION_THREE;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.barrelConstants.POSITION_TWO;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.barrelConstants.TURNING_SPEED;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants;


public class Revolver {
    GamepadEx driversGamepad;
    Motor gunSpinner;
    public Revolver(GamepadEx driversGamepad, HardwareMap hrdmap) {
        this.driversGamepad = driversGamepad;

         gunSpinner = new Motor(hrdmap, "Barrel Motor");
    }

        //Goto position 1 means that position 1 will be facing the shooter ready to be shot
    public void gotoPos1() {
        gunSpinner.setTargetPosition(POSITION_ONE);
        gunSpinner.setRunMode(Motor.RunMode.RawPower);
        gunSpinner.set(TURNING_SPEED);
    }


    public void gotoPos2() {
        gunSpinner.setTargetPosition(POSITION_TWO);
        gunSpinner.setRunMode(Motor.RunMode.RawPower);
        gunSpinner.set(TURNING_SPEED);
    }

    public void gotoPos3() {
        gunSpinner.setTargetPosition(POSITION_THREE);
        gunSpinner.setRunMode(Motor.RunMode.RawPower);
        gunSpinner.set(TURNING_SPEED);
    }





}
