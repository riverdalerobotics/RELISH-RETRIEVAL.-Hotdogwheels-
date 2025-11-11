package org.firstinspires.ftc.teamcode.ExampleCommandBased;


import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.gamepad.GamepadKeys.Button;
public class OIHotdog {


    GamepadEx driver, operator;

    public OIHotdog(GamepadEx driver, GamepadEx operator){
        this.driver = driver;
        this.operator = operator;
    }

    public GamepadButton driving() {
        return new GamepadButton(
                driver, Button.LEFT_STICK_BUTTON, Button.RIGHT_STICK_BUTTON, Button.B
        );
    }







}
