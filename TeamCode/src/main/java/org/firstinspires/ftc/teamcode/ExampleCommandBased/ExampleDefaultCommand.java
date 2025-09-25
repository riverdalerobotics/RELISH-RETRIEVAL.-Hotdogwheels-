package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;

public class ExampleDefaultCommand extends CommandBase {
    ExampleSubsystem subsystem;
    public ExampleDefaultCommand(ExampleSubsystem subsystem){
        this.subsystem = subsystem;
        addRequirements(subsystem);
    }


    @Override
    public void initialize() {
        super.initialize();
        subsystem.setMotorPower(0);
    }
}
