package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

//Created by Jacob Kaiserman
@Autonomous
public class autonomous extends LinearOpMode {
    private DcMotor frontLeft;
    private DcMotor backLeft;
    private DcMotor frontRight;
    private DcMotor backRight;

    //function for moving forward n ticks
    public void drive(String direction, int distance) {
        //switch statement for different directions
        distance = (int) Math.round(distance/0.036);
        switch(direction){
            case "forward":
                //code for forward
                frontLeft.setTargetPosition(distance);
                backLeft.setTargetPosition(distance);
                frontRight.setTargetPosition(distance);
                backRight.setTargetPosition(distance);
                telemetry.addData(">", "moved forward");
                break;
            case "backward":
                //code for backward
                frontLeft.setTargetPosition(-distance);
                backLeft.setTargetPosition(-distance);
                frontRight.setTargetPosition(-distance);
                backRight.setTargetPosition(-distance);
                break;
            case "left":
                //code for left
                frontLeft.setTargetPosition(-distance);
                backLeft.setTargetPosition(distance);
                frontRight.setTargetPosition(distance);
                backRight.setTargetPosition(-distance);
                break;
            case "right":
                //code for right
                frontLeft.setTargetPosition(distance);
                backLeft.setTargetPosition(-distance);
                frontRight.setTargetPosition(-distance);
                backRight.setTargetPosition(distance);
                break;
            default:
                telemetry.addData(">", "no direction set");
                telemetry.update();
        }

    }

    @Override
    public void runOpMode() throws InterruptedException{ //if broken delete throws
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backRight = hardwareMap.get(DcMotor.class, "backRight");

        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        if (opModeIsActive()) {
            frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            frontLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            backLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            frontRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            backRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

            while (opModeIsActive()) {
                drive("forward",20);
                drive("backward",10);

                frontLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                backLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                frontRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                backRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

                //power is set
                frontLeft.setPower(1);
                frontRight.setPower(1);
                backLeft.setPower(1);
                backRight.setPower(1);

            }
        }
    }
}
