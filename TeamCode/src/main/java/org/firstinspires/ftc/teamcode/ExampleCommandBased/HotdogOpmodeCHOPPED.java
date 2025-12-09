package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;

@TeleOp (name = "HotdogwheelsbutCHOPPED")
public class HotdogOpmodeCHOPPED extends CommandOpMode {

Chassis chassis;
GamepadEx driver;
GamepadEx operator;
IMU imu;
driveCommand driveCommand;
    @Override
    public void initialize() {
        imu = hardwareMap.get(IMU.class, "IMU");
        imu.resetYaw();
        IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.LEFT,
                RevHubOrientationOnRobot.UsbFacingDirection.UP));
        imu.initialize(parameters);
        chassis = new Chassis(hardwareMap, imu);
        driver = new GamepadEx(gamepad1);
        operator = new GamepadEx(gamepad2);
        driveCommand = new driveCommand(chassis, driver);
        register(chassis);
        schedule(driveCommand);
        chassis.setDefaultCommand(driveCommand);

    }

    @Override
    public void run() {
        super.run();
        CommandScheduler.getInstance().run();
        telemetry.update();
    }
}
