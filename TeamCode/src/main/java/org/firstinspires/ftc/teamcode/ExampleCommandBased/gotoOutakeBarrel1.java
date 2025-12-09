package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;

public class gotoOutakeBarrel1 extends CommandBase {

    Revolver barrel;

    public gotoOutakeBarrel1(Revolver barrel) {
        this.barrel = barrel;
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        super.execute();
        barrel.gotoOutakePos1();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        barrel.stopSpinning();
    }

    @Override
    public boolean isFinished() {
        return barrel.getGunSpinner().atTargetPosition();
    }
}
