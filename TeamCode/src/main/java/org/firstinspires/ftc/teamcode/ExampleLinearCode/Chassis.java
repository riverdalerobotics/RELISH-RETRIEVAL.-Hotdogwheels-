//package org.firstinspires.ftc.teamcode.ExampleLinearCode;
//import com.arcrobotics.ftclib.hardware.motors.Motor;
//import com.arcrobotics.ftclib.drivebase.MecanumDrive;
//
//
//public class Chassis {
//
//    Motor backleftMotor;
//    Motor backRightMotor;
//    Motor frontleftMotor;
//    Motor frontRightMotor;
//    MecanumDrive mecanum;
//
//    public Chassis(Motor backleftMotor, Motor backRightMotor, Motor frontleftMotor, Motor frontRightMotor) {
//
//        this.backleftMotor = backleftMotor;
//        this.backRightMotor = backRightMotor;
//        this.frontleftMotor = frontleftMotor;
//        this.frontRightMotor = frontRightMotor;
//
//        mecanum = new MecanumDrive(frontleftMotor, frontRightMotor, backleftMotor, backRightMotor);
//
//    }
//
//
//    public void robotOriented(double strafeSpeed, double forwardSpeed, double turnSpeed) {
//        mecanum.driveRobotCentric(strafeSpeed, forwardSpeed, turnSpeed);
//    }
//


//}
