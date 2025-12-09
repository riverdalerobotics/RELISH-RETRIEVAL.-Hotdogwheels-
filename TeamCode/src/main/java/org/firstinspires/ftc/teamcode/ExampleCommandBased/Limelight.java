package org.firstinspires.ftc.teamcode.ExampleCommandBased;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLResultTypes;
import com.qualcomm.hardware.limelightvision.LLStatus;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Limelight extends SubsystemBase {

Limelight3A limelight;
Integer obtainedID = null; //Interger is used because it can be null while int cannot

public Limelight(HardwareMap hrdware) {

    limelight = hrdware.get(Limelight3A.class, "Limelight");
    limelight.setPollRateHz(100);
    limelight.start();

}
//skibidi
public int getFiducialID() {
    //needs a loop (So op mode)
    //IDs 21 and 24 are the navigation Ids, which we don't want here.
    if (obtainedID != null && obtainedID != 21 && obtainedID != 24) { //this keeps the first scanned april tag's id. However, there's a *chance
        return obtainedID;    // that the wrong april tag id is scanned during a game. Accommodate for that, ye? Button or smth
        //Part above returns the id, so both parts of the statement return the ID.
    } else {
        LLResult results = limelight.getLatestResult(); //This is getting the latest frame of the limelight thing
        if (results==null || results.getFiducialResults().isEmpty()) { //Code crashes without this part
            return -1;                                                 //Basically code is if no apriltag detected, don't panic
        }

        LLResultTypes.FiducialResult apriltag = results.getFiducialResults().get(0); //0 means detect the first april
        obtainedID = apriltag.getFiducialId(); //Code for the if statement
        return apriltag.getFiducialId(); //yippee it's the id!
        }
    }
}







