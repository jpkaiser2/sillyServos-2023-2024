package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.Hardware;

@TeleOp
public class drive2 extends LinearOpMode{
    Hardware robot = new Hardware(this);
    @Override
    public void runOpMode() throws InterruptedException { //if broken delete throws

        robot.drive("forward", 1520);

    }
}
