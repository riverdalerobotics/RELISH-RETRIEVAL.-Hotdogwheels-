package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.arcrobotics.ftclib.hardware.motors.MotorGroup;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.intakeConstants.SPIN_SPEED;
public class Intake extends SubsystemBase {

    Motor intakeSpinnerR;
    Motor intakeSpinnerL;
    MotorGroup intakeGroup;

    public Intake(HardwareMap hrdware) {


        intakeSpinnerR = new Motor(hrdware, "intakeMotorRight");
        intakeSpinnerL = new Motor(hrdware, "intakeMotorLeft");
        intakeGroup = new MotorGroup(intakeSpinnerR, intakeSpinnerL);
        intakeSpinnerL.setInverted(true);
    }

    public void Spin(boolean x) {

        if (x) {
            intakeGroup.set(SPIN_SPEED);
        } else {
            intakeGroup.set(0);
        }

    }
}









