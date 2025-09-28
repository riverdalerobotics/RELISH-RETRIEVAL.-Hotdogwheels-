package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.drivebase.RobotDrive;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.arcrobotics.ftclib.geometry.Vector2d;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Chassis {

Motor frontLeft = new Motor();
Motor frontRight = new Motor();
Motor backLeft = new Motor();
Motor backRight = new Motor();
MecanumDrive mecanumDrive = new MecanumDrive(true, frontLeft, frontRight,backLeft,backRight);



public void fieldOriented(double strafeSpeed,double forwardSpeed, double turn, double heading) {
    mecanumDrive.driveFieldCentric(strafeSpeed, forwardSpeed, turn, heading);
}
public void robotOriented(double strafeSpeed, double forwardSpeed, double turnSpeed) {
    mecanumDrive.driveRobotCentric(strafeSpeed, forwardSpeed, turnSpeed);
}



//you need to figure out how to use auto! Allegedly it's pretty easy just check it out later
    }











