package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
public class ShooterCommand extends CommandBase {
    Shooter shooter;
    GamepadEx gamepad;


    public ShooterCommand(Shooter shooter) {
        this.shooter = shooter;


    }

    @Override
    public void initialize() {
        super.initialize();


    }

    @Override
    public void execute() {
        super.execute();

        shooter.Shoot();
    }

    @Override
    public void end(boolean interrupted) {
        super.end(interrupted);
        shooter.stopShoot();
    }
}
