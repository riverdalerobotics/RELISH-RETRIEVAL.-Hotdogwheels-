package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

public class IntakeCommand extends CommandBase {

    Intake intake;
    GamepadEx gamepad;
    Revolver barrel;

    public IntakeCommand(Intake intake, GamepadEx gamepad, Revolver barrel) {
        this.intake = intake;
        this.gamepad = gamepad;
        this.barrel = barrel;
        addRequirements(intake);
        addRequirements(barrel);
    }

    @Override
    public void initialize() {
        super.initialize();
        barrel.gotoIntakePos1();
    }

    @Override
    public void execute() {
        super.execute();

        //Insert colour sensor code here
//        intake.Spin();

    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);

    }
    @Override
    public boolean isFinished() {


    return true;
}
}



