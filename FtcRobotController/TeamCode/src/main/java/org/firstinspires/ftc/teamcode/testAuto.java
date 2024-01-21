//Created by Jacob Kaiserman
//Silly Servos FTC Team #24213 - https://github.com/jpkaiser2/sillyServos
package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous(name="mainAuto", group="Linear Opmode")
// @Disabled
public class testAuto extends LinearOpMode {
    Hardware robot = new Hardware(this);
    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        if (opModeIsActive()) {
            robot.init();
            while (opModeIsActive()) {
                robot.drive("forward",0.5,200);
                robot.stop();
                robot.drive("left",1,10000);
                robot.stop();
            }
        }
    }
}