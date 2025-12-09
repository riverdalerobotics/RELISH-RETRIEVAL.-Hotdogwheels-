package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;

public class LiftyDownyCommand extends CommandBase {

    Indexer index;

    public LiftyDownyCommand(Indexer index){
        this.index = index;
    }

    @Override
    public void initialize() {
        super.initialize();
        index.setDirectionDown();
    }


    @Override
    public void execute() {
        super.execute();

        index.liftBackwards();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        index.setDirectionUp();

    }
}
