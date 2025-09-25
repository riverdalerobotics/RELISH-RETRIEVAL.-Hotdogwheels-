package org.firstinspires.ftc.teamcode.ExampleCommandBased;


import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp (name = "Example Command OpMode", group = "R3P2 Examples")
public class ExampleCommandOpMode extends CommandOpMode {

    ExampleSubsystem subsystem;
    OI oi = new OI(new GamepadEx(gamepad1), new GamepadEx(gamepad2));
    @Override
    public void initialize(){
        subsystem.setDefaultCommand(new ExampleDefaultCommand(subsystem));
    }
    @Override
    public void run(){
        super.run();
        oi.intake().whenPressed(new ExampleCommand(subsystem));
    }


}


