# sillyServos
Code repository for the Silly Servos Robotics Team #24213
<br>
2023-2024 FTC Centerstage

<img src="https://jacobkaiserman.com/sillyServos/images/hpRobotics.png" width="30%">
<br>
<h2>Controls</h2>
<img src="https://jacobkaiserman.com/sillyServos/controller.png">


<p>Forward: left joystick (3) up</p>
<p>Backward: left joystick (3) down</p>
<p>Left: left joystick (3) left</p>
<p>Right: left joystick (3) right</p>
<p>Turn right: right joystick (4) right</p>
<p>Turn left: right joystick (4) left</p>
<p>Hanger up: a (7)</p>
<p>Hanger down: b (6)</p>
<p>Launch drone: RB (2)</p>
<p>Reset launcher: LB (1)</p>
<h2>About the Code</h2>
<p>
<b>Driver controlled:</b>
For our driver-controlled period, we created a mecanum drive code. This allows us to move left and right without having to turn. It works by creating a coordinate system and finding the direction of the joystick.
</p>
<p>
<b>Autonomous:</b>
All of the robot’s components are defined in the <code>Hardware.java</code> file. Some functions, such as the one to move in any direction, are also defined in this file. We did this so that we could simply call <code>robot.init()</code> to configure the robot. It allows us to create new autonomous programs faster. We have four autonomous programs; two for each alliance. We did this so that the robot does not have to be in a specific position to work during the autonomous period. All of our autonomous programs place two preloaded pixels and park backstage.
</p>
