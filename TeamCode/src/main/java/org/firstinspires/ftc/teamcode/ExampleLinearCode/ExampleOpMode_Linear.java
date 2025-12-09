//package org.firstinspires.ftc.teamcode.ExampleLinearCode;
//
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.arcrobotics.ftclib.hardware.motors.Motor;
//import com.qualcomm.robotcore.hardware.HardwareMap;
//
//
//@TeleOp(group = "R3P2 Examples", name = "ExampleOpMode")
//public class ExampleOpMode_Linear extends LinearOpMode {
//
//    Motor backleftMotor;
//    Motor backrightMotor;
//    Motor frontleftMotor;
//    Motor frontrightMotor;
//    Chassis chassis;
//    double strafeSpeed;
//    double forwardSpeed;
//    double turnSpeed;
//
//    @Override
//    public void runOpMode() throws InterruptedException {
//
//        backleftMotor = hardwareMap.get(Motor.class, "backleftMotor");
//        backrightMotor = hardwareMap.get(Motor.class, "backrightMotor");
//        frontleftMotor = hardwareMap.get(Motor.class, "frontleftMotor");
//        frontrightMotor = hardwareMap.get(Motor.class, "frontrightMotor");
//
//        chassis = new Chassis(backleftMotor, backrightMotor, frontleftMotor, frontrightMotor);
//
//        waitForStart();
//        while(opModeIsActive()){
//
//            strafeSpeed = gamepad1.left_stick_x;
//            forwardSpeed = gamepad1.left_stick_y;
//            turnSpeed = gamepad1.right_stick_x;
//
//            chassis.robotOriented(strafeSpeed, forwardSpeed, turnSpeed);
//;
//
//        }
//    }
//}
