package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.Command;
import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.CommandGroupBase;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

public class grpShootOutake2 extends SequentialCommandGroup {

    Revolver barrel;
    Shooter shooter;
    Indexer index;

    public grpShootOutake2() {
        addCommands(

                new gotoOutakeBarrel2(barrel),

                new LiftyCommand(index),

                new ShooterCommand(shooter),

                new LiftyDownyCommand(index)

        );
    }
}