package org.firstinspires.ftc.teamcode.ExampleCommandBased;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


public class HotdogCommandOpMode extends CommandOpMode {
    Chassis chassis;
    GamepadEx driver;
    GamepadEx operator;
    driveCommand drivedefault;

    OIHotdog oi;
    @Override
    public void initialize() {
        driver = new GamepadEx(gamepad1);
        operator = new GamepadEx(gamepad2);
        oi = new OIHotdog(driver, operator);
        chassis = new Chassis(hardwareMap);
        drivedefault = new driveCommand(chassis,driver);
        register(chassis);
        schedule(drivedefault);
        chassis.setDefaultCommand(drivedefault);
    }

    public void run() {
        super.run();
        CommandScheduler.getInstance().run();
        telemetry.update();
    }
}

