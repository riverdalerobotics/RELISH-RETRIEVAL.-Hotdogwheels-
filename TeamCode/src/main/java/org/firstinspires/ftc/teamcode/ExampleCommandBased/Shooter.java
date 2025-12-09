package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.hardware.motors.MotorGroup;
import com.qualcomm.robotcore.hardware.HardwareMap;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.shooterConstants.SHOOT_SPEED;

public class Shooter extends SubsystemBase {

    GamepadEx shooterGamepad;
    Motor shooterR;
    Motor shooterL;
    MotorGroup shooterGroup;
    public Shooter(GamepadEx shooterGamepad, HardwareMap hrdware) {
        this.shooterGamepad = shooterGamepad;
        shooterR = new Motor(hrdware,"shooterMotorRight");
        shooterL = new Motor(hrdware, "shooterMotorLeft");
        shooterGroup = new MotorGroup(shooterR, shooterL);
    }

    public void Shoot() {
        shooterGroup.set(SHOOT_SPEED);
    }

    public void stopShoot(){
        shooterGroup.set(0);
    }
}
