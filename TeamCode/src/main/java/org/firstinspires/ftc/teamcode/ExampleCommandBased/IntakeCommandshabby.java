package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;

public class IntakeCommandshabby extends CommandBase {
    Intake intake;
    GamepadEx gamepad;
    public IntakeCommandshabby(Intake intake, GamepadEx gamepad) {
        this.intake = intake;
       this.gamepad = gamepad;
        addRequirements(intake);
    }

    @Override
    public void initialize() {
        super.initialize();

    }

    @Override
    public void execute() {
        super.execute();
        intake.Spin(gamepad.getButton(GamepadKeys.Button.B));
    }


    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        intake.Spin(false);
    }
}
