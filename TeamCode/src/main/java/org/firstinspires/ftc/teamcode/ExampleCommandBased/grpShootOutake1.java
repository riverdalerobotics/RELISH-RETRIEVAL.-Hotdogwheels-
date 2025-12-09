package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.Command;
import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.CommandGroupBase;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

public class grpShootOutake1 extends SequentialCommandGroup {

    Revolver barrel;
    Shooter shooter;
    Indexer index;



    public grpShootOutake1() {
        addCommands(
                //Note: you might have to run things "in parallel". Parallel cmd group and divide it a bit more.
                new gotoOutakeBarrel1(barrel), //Goto Outakepos1

                new LiftyCommand(index), //Lift the indexer

                new ShooterCommand(shooter), //Fire!

                new LiftyDownyCommand(index) //erectile dysfunction
        );
    }
}
