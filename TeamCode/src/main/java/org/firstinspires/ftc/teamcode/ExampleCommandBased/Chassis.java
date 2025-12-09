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
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.ImuOrientationOnRobot;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Chassis extends SubsystemBase {


MecanumDrive mecanumDrive;

IMU imu;
public Chassis(HardwareMap hrdMap, IMU imu) {
    Motor frontLeft = new Motor(hrdMap, "frontLeftMotor");
    Motor frontRight = new Motor(hrdMap,"frontRightMotor");
    Motor backLeft = new Motor(hrdMap, "backLeftMotor");
    Motor backRight = new Motor(hrdMap, "backRightMotor");
    this.imu = imu;

//creating motors+
    mecanumDrive = new MecanumDrive(true, frontLeft,frontRight,backLeft,backRight);

}



public void fieldOriented(double strafeSpeed, double forwardSpeed, double turn) {
    double yaw = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS); // calculated from IMU

    double rotX = (strafeSpeed * Math.cos(-yaw)) - (forwardSpeed * Math.sin(-yaw));
    double rotY = (strafeSpeed * Math.sin(-yaw)) + (forwardSpeed * Math.cos(-yaw));
    mecanumDrive.driveFieldCentric(rotX, rotY, turn, yaw);
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











