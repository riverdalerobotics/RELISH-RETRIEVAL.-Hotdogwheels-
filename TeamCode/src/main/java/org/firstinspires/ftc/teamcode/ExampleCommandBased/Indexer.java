package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.indexerConstants.BELT_SPEED;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.indexerConstants.SERVO_SPEED;
public class Indexer {

    GamepadEx gamepadIndexer;
    Motor indexMotor;
    Servo liftyThingServo;

    public Indexer(GamepadEx gamepadIndexer, HardwareMap hrdware) {

        this.gamepadIndexer = gamepadIndexer;

        indexMotor = new Motor(hrdware, "indexMotor");
        liftyThingServo = hrdware.get(Servo.class, "Servovator"); //like servo-elevator. It's funny.
    }

    public void runIndexer() {
        indexMotor.set(BELT_SPEED);
    }

    public void stopIndexer() {
        indexMotor.set(0);
    }

    public void liftForward() {
        liftyThingServo.setPosition(1);
    }

    public void liftBackwards() {
        liftyThingServo.setPosition(0);
    }
}
