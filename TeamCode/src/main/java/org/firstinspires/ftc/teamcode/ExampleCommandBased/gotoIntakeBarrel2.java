package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;

public class gotoIntakeBarrel2 extends CommandBase {

    Revolver barrel;

    public gotoIntakeBarrel2 (Revolver barrel) {
        this.barrel = barrel;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        super.execute();
        barrel.gotoIntakePos2();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        barrel.stopSpinning();
    }
}
