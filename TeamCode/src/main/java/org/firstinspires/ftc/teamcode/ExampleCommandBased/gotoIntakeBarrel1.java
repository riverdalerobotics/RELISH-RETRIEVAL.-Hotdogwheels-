package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;

public class gotoIntakeBarrel1 extends CommandBase {

    Revolver barrel;

    public gotoIntakeBarrel1(Revolver barrel) {
        this.barrel = barrel;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        super.execute();
        barrel.gotoIntakePos1();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        barrel.stopSpinning();
    }
}
