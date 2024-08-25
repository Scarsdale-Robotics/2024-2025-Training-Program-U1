package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.HardwareRobot;
import org.firstinspires.ftc.teamcode.subsystems.DriveSubsystem;

@TeleOp(name="Stephen's TeleOp")
public class StephenTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        // Initialization code.
        HardwareRobot robot = new HardwareRobot(hardwareMap);
        DriveSubsystem drive = new DriveSubsystem(
                robot.leftFront,
                robot.rightFront,
                robot.leftBack,
                robot.rightBack
        );

        waitForStart();

        // Main loop.
        while (opModeIsActive()) {
            // Get the left joystick x position.
            double strafe = gamepad1.left_stick_x;
            // Get the inverted left joystick y position.
            double forward = -gamepad1.left_stick_y;
            // Get the right joystick x position.
            double turn = gamepad1.right_stick_x;

            // Drive using:
            //      Left Joystick X as strafe power
            //      Left Joystick Y as forward power
            //      Right Joystick X as turn power
            drive.driveRobotCentric(strafe, forward, turn);

        }

    }
}
