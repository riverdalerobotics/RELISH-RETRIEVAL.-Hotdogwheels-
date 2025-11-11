package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.arcrobotics.ftclib.gamepad.GamepadKeys.Button;




public class OI {
    GamepadEx driver, operator;
    public OI(GamepadEx driver, GamepadEx operator){
        this.driver = driver;
        this.operator = operator;
    }
    public GamepadButton intake(){
        return new GamepadButton(
                operator, Button.A
        );



        }
    }





