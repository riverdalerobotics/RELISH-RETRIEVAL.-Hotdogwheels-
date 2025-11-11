package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.drivebase.RobotDrive;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.arcrobotics.ftclib.geometry.Vector2d;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

public class Chassis extends SubsystemBase {


MecanumDrive mecanumDrive;


public Chassis(HardwareMap hrdMap) {
    Motor frontLeft = new Motor(hrdMap, "frontLeftMotor");
    Motor frontRight = new Motor(hrdMap,"frontRightMotor");
    Motor backLeft = new Motor(hrdMap, "backLeftMotor");
    Motor backRight = new Motor(hrdMap, "backRightMotor");
//creating motors

    mecanumDrive = new MecanumDrive(true, frontLeft,frontRight,backLeft,backRight);

}



public void fieldOriented(double strafeSpeed,double forwardSpeed, double turn, double heading) {
    mecanumDrive.driveFieldCentric(strafeSpeed, forwardSpeed, turn, heading);
    //field oriented
}
public void robotOriented(double strafeSpeed, double forwardSpeed, double turnSpeed, boolean slowMode) {
    if (slowMode) {
        mecanumDrive.driveRobotCentric(strafeSpeed/2, forwardSpeed/2, turnSpeed/2);
    } else {
        mecanumDrive.driveRobotCentric(strafeSpeed,forwardSpeed,turnSpeed);
    }

    //robot oriented
}



//you need to figure out how to use auto! Allegedly it's pretty easy just check it out later
    }











