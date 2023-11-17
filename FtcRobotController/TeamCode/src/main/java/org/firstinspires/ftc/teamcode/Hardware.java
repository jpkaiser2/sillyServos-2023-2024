package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

public class Hardware {

    /* Declare OpMode members. */
    private LinearOpMode myOpMode = null;   // gain access to methods in the calling OpMode.

    // Define Motor and Servo objects  (Make them private so they can't be accessed externally)

    private DcMotor frontLeft = null;
    private DcMotor backLeft = null;
    private DcMotor frontRight = null;
    private DcMotor backRight = null;
    private DcMotor arm = null;



    // Define a constructor that allows the OpMode to pass a reference to itself.
    public Hardware (LinearOpMode opmode) {
        myOpMode = opmode;
    }

    public void init()    {
        frontLeft = myOpMode.hardwareMap.get(DcMotor.class, "frontLeft");
        backLeft = myOpMode.hardwareMap.get(DcMotor.class, "backLeft");
        frontRight = myOpMode.hardwareMap.get(DcMotor.class, "frontRight");
        backRight = myOpMode.hardwareMap.get(DcMotor.class, "backRight");
        arm = myOpMode.hardwareMap.get(DcMotor.class, "arm");

        // To drive forward, the motor on one side needs to be reversed because the axles point in opposite directions.
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


        myOpMode.telemetry.addData(">", "Hardware Initialized");
        myOpMode.telemetry.update();
    }


    public void drive(String direction, int ticks) {
        switch(direction){
            case "forward":
                //code for forward
                break;
            case "backward":
                //code for backward
                break;
            case "left":
                //code for left
                break;
            case "right":
                //code for right
                break;
            default:
                myOpMode.telemetry.addData(">", "no direction set");
                myOpMode.telemetry.update();
        }
    }


}
