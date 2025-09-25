package org.firstinspires.ftc.teamcode.ExampleLinearCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(group = "R3P2 Examples", name = "ExampleOpMode")
public class ExampleOpMode_Linear extends LinearOpMode {
    DcMotor shootMotor;
    @Override
    public void runOpMode() throws InterruptedException {
        shootMotor = hardwareMap.get(DcMotor.class, "ShootMotor");
        waitForStart();

        while(opModeIsActive()){
            if(gamepad1.a) {
                shootMotor.setPower(1);
            } else{
                shootMotor.setPower(0);
            }
        }
    }
}
