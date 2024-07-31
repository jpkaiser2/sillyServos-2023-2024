# sillyServos
Code repository for the Silly Servos Robotics Team #24213
<br>
2023-2024 FTC Centerstage

<img src="https://jacobkaiserman.com/sillyServos-2023-2024/images/hpRobotics.png" width="30%">
<br>
<h2>Controls</h2>
<img src="https://jacobkaiserman.com/sillyServos-2023-2024/controller.png">


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
<h2>The Robot</h2>
<p>
<b>Hanging Arm:</b>
Following our initial competition, we transitioned the functionality of our grabbing arm into a hanging arm configuration to score more points for the next tournament. As a pushbot rather than a pixel-grabbing robot, we could still provide our alliance with value for the second competition while still focusing on a future arm. The hanging arm involves a gear system directly linked to a motor, enabling precise adjustment of the arm's height. Positioned atop the arm is a hook-like component designed to engage with a bar fixture. Once the arm's hook securely connects with the bar, the gear system turns, allowing a slow but sturdy hang.
Initially, we tried to make a hook mechanism capable of securing a locked position on the bar before initiating the ascent. However, iterative testing and refinement led us to adopt a shorter, yet more stable hook model, which ensured reliable hanging.
</p>
<p>
<b>Airplane Launcher:</b>
For our last tournament, our focus was on achieving the highest amount of points from the third competition to the fourth. The launcher is made of a metal bar, two L-brackets to keep the airplane held, and a servo at the rear end. The servo has an additional L-bracket, facilitating the controlled deployment of a 2-inch screw housing a rubber band. A rubber band tied to the front is pulled back and fastened to the screw of the servo. Coming into the fourth competition, this was our biggest addition to the physical robot.
</p>
<img src="https://jacobkaiserman.com/sillyServos-2023-2024/images/hanging.png" width="50%">
