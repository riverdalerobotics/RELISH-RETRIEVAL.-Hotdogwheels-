package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.indexerConstants.BELT_SPEED;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.indexerConstants.MAX_POSITION;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.indexerConstants.MIN_POSITION;
import static org.firstinspires.ftc.teamcode.ExampleCommandBased.Constants.indexerConstants.SERVO_SPEED;
public class Indexer extends SubsystemBase {


    Servo liftyThingServo;

    public Indexer(HardwareMap hrdware) {
        liftyThingServo = hrdware.get(Servo.class, "Servovator"); //like servo-elevator. It's funny.

    }


    public void liftForward() {
        liftyThingServo.setPosition(0.8/MAX_POSITION);
    }
    public void liftBackwards() {

        liftyThingServo.setPosition(0.8/MIN_POSITION);

    }

    public void setDirectionUp() {
        liftyThingServo.setDirection(Servo.Direction.FORWARD);
    }

    public void setDirectionDown() {
        liftyThingServo.setDirection(Servo.Direction.REVERSE);
    }




}
