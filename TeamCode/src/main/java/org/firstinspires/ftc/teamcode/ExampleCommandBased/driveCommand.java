package org.firstinspires.ftc.teamcode.ExampleCommandBased;
import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.Subsystem;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class driveCommand extends CommandBase {

    Chassis drive;
    GamepadEx drivingPadYippee;


    public driveCommand(Chassis drive, GamepadEx gamePad) {
        this.drive = drive;
        this.drivingPadYippee = gamePad;
        addRequirements(drive);
    }

    @Override
    public void initialize() {
        super.initialize();


    }

    public void execute() {
        super.execute();
        drive.fieldOriented(drivingPadYippee.getLeftX(), drivingPadYippee.getLeftY(), drivingPadYippee.getRightX());
    }

    public void end(boolean interrupted) {
        super.end(interrupted);
    }
    @Override
    public boolean isFinished() {

        return false;
    }
}
