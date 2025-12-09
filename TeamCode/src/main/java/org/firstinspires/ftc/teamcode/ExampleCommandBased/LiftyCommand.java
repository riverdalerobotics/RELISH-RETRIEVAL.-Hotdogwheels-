package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;

public class LiftyCommand extends CommandBase {

    Indexer index;

    public LiftyCommand(Indexer index){
        this.index = index;
    }

    @Override
    public void initialize() {
        super.initialize();
        index.setDirectionUp();
    }

    @Override
    public void execute() {
        super.execute();

        index.liftForward();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        index.setDirectionDown();
    }
}


