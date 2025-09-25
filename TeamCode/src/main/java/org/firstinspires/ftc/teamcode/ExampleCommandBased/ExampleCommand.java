package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;

public class ExampleCommand extends CommandBase {
    ExampleSubsystem subsystem;
    public ExampleCommand(ExampleSubsystem subsystem){
        //Init objects here and add requirements
        this.subsystem = subsystem;
        addRequirements(subsystem);
    }

    @Override
    public void initialize() {
        //Put init code here, runs once when command is called
        super.initialize();
    }

    @Override
    public void execute() {
        //Put code that runs over and over in here, runs in a loop until is finished is true
        super.execute();
    }

    @Override
    public void end(boolean interrupted) {
        //Put code that runs when the command is over, runs once when the command finishes
        super.end(interrupted);
    }

    @Override
    public boolean isFinished() {
        //returns a boolean, when true the command is finished
        return false;
    }
}
