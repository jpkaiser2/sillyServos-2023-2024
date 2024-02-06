package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="servoTest")
public class servoTest extends OpMode {

    private Servo myServo;

    @Override
    public void init() {
        myServo = hardwareMap.get(Servo.class, "drone"); // Replace "myServo" with your servo's name
        myServo.setPosition(0.5); // Set initial position to the middle
    }

    @Override
    public void loop() {
        double position = 0.5; // Maintain a variable for servo position

        // Control servo position based on gamepad input (adjust for your preferred buttons/axes):
        if (gamepad1.right_bumper) {
            position += 0.01; // Increase position gradually
        } else if (gamepad1.left_bumper) {
            position -= 0.01; // Decrease position gradually
        }

        // Constrain position within valid range:
        position = Math.max(0.0, Math.min(1.0, position));

        // Set the servo position:
        myServo.setPosition(position);

        // Optional: Display servo position on the driver station:
        telemetry.addData("Servo Position", position);
        telemetry.update();
    }
}

