package org.firstinspires.ftc.teamcode.ExampleCommandBased;

import com.arcrobotics.ftclib.command.Subsystem;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ExampleSubsystem extends SubsystemBase {
    //Make your objects here
    HardwareMap hardwareMap;
    DcMotor exampleMotor = hardwareMap.get(DcMotor.class, "MotorName");
    public ExampleSubsystem(){
        //Init code goes here
    }
    //methods for commands go here
    public void setMotorPower(double speed){
        exampleMotor.setPower(speed);
    }

    @Override
    public void periodic() {
        super.periodic();
        //Things that run over and over again go here
    }
}


