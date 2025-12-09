package org.firstinspires.ftc.teamcode.ExampleCommandBased;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.Subsystem;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;

@TeleOp (name = "HotdogWheels")
public class HotdogCommandOpMode extends CommandOpMode {
    Chassis chassis;
    GamepadEx driver;
    GamepadEx operator;
    driveCommand drivedefault;
    IMU imu;
    OIHotdog oi;
    Intake intake;
    IntakeCommandshabby intakey;
    Limelight limelight;
    ColourSensor coloursensor;
    @Override
    public void initialize() {
        imu = hardwareMap.get(IMU.class, "IMU");
        imu.resetYaw();
        IMU.Parameters parameters = new IMU.Parameters(new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.LEFT,
                RevHubOrientationOnRobot.UsbFacingDirection.UP));
        imu.initialize(parameters);
        driver = new GamepadEx(gamepad1);
        operator = new GamepadEx(gamepad2);
        oi = new OIHotdog(driver, operator);
        chassis = new Chassis(hardwareMap, imu);
        limelight = new Limelight(hardwareMap);
        drivedefault = new driveCommand(chassis,driver);
        intake = new Intake(hardwareMap);
        intakey = new IntakeCommandshabby(intake, operator);
        coloursensor = new ColourSensor(hardwareMap);
        register(coloursensor);
        register(limelight);
        register(chassis);
        schedule(drivedefault);
        chassis.setDefaultCommand(drivedefault);

        register(intake);
        schedule(intakey);

    }
    @Override
    public void run() {
        super.run();
        CommandScheduler.getInstance().run();

        int aprilTagID = limelight.getFiducialID(); //Make sure it's AHEAD of the code that need the limelight ID...
        boolean isGreen = coloursensor.isGreen();

       // operator.getGamepadButton(GamepadKeys.Button.B).whileHeld(intakey);


        if (aprilTagID == 21) {
            boolean GPP = true;
        } else {
            boolean GPP = false;
        }

        if (aprilTagID == 22) {
            boolean PGP = true;
        } else {
            boolean PGP = false;
        }

        if (aprilTagID == 23) {
            boolean PPG = true;
        } else {
            boolean PPG = false;
        }

        //If --- isn't green, keep scrolling until it is.
        //When it is green, depending on the combo, rotate and fire (use if and else statements)
        //For intaking, set it so "default position" is always outake 1 or smth, and just making it shuffle and sort later with the pseudo code mentioned above.




        telemetry.update();




    }
}

