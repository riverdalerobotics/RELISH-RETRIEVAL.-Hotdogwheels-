package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.arcrobotics.ftclib.hardware.motors.MotorGroup;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.intakeConstants.SPIN_SPEED;
public class Intake {
    GamepadEx intakeGamepad;
    Motor intakeSpinnerR;
    Motor intakeSpinnerL;
    MotorGroup intakeGroup;
    public Intake(GamepadEx intakeGamepad, HardwareMap hrdware) {

        this.intakeGamepad = intakeGamepad;
        intakeSpinnerR = new Motor(hrdware,"intakeMotorRight");
        intakeSpinnerL = new Motor(hrdware, "intakeMotorLeft");
        intakeGroup = new MotorGroup(intakeSpinnerR,intakeSpinnerL);
    }

    public void Spin() {
        intakeGroup.set(SPIN_SPEED);

    }

    public void stopSpinorDie() {
        intakeGroup.set(0);
    }

}
