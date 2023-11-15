package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class main extends LinearOpMode {

    private DcMotor frontLeft;
    private DcMotor backLeft;
    private DcMotor frontRight;
    private DcMotor backRight;
    private DcMotor arm;

    @Override
    public void runOpMode() throws InterruptedException{ //if broken delete throws
        float x;
        float y;
        float clockwise;
        double fl;
        double fr;
        double bl;
        double br;
        double speed = 1;

        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        arm = hardwareMap.get(DcMotor.class, "arm");

        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        if (opModeIsActive()) {
            frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            boolean currentDirection = false;
            while (opModeIsActive()) {
                x = gamepad1.left_stick_x;
                y = -gamepad1.left_stick_y;
                clockwise = gamepad1.right_stick_x;

                telemetry.addData("A", gamepad1.dpad_up);
                if (gamepad1.dpad_up) {
                    y = (float) 1.0;
                } else if (gamepad1.dpad_down) {
                    y = (float) -1.0;
                }

                if (gamepad1.dpad_right) {
                    x = (float) 1.0;
                } else if (gamepad1.dpad_left) {
                    x = (float) -1.0;
                }

                if (gamepad1.back) {
                    clockwise = (float) -1.0;
                } else if (gamepad1.guide) {
                    clockwise = (float) 1.0;
                }
                clockwise /= 2;
                fl = y + x + clockwise;
                fr = y - x - clockwise;
                bl = y - x + clockwise;
                br = y + x - clockwise;

                if (gamepad1.left_trigger>0) {
                    arm.setPower(gamepad1.left_trigger/2);
               }
                if (gamepad1.right_trigger>0) {
                    arm.setPower(-gamepad1.right_trigger/2);
                }
                speed = 0.5;
                fl /= speed;
                fr /= speed;
                bl /= speed;
                br /= speed;

                telemetry.addData("SPEED",speed);
                telemetry.addData("FLP", fl);
                telemetry.addData("FRP", fr);
                telemetry.addData("BLP", bl);
                telemetry.addData("BRP", br);
                telemetry.addData("Clockwise", clockwise);
                telemetry.addData("Arm-L", gamepad1.left_trigger);
                telemetry.addData("Arm-R", gamepad1.right_trigger);

                frontLeft.setPower(fl);
                frontRight.setPower(fr);
                backLeft.setPower(bl);
                backRight.setPower(br);

                telemetry.update();
            }
        }
    }
}
