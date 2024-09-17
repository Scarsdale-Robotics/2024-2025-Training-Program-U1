package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareRobot;
import org.firstinspires.ftc.teamcode.subsystems.DriveSubsystem;

@TeleOp(name = "Samuel's TeleOp")
public class SamuelTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        HardwareRobot robot = new HardwareRobot(hardwareMap);
        DriveSubsystem drive = new DriveSubsystem(
                robot.leftFront,
                robot.rightFront,
                robot.rightBack,
                robot.leftBack

        );
        waitForStart();

        while(opModeIsActive()) {
           double strafe = gamepad1.left_stick_x;
           double forward = gamepad1.left_stick_y;
           double turn = gamepad1.right_stick_x;
           double speed = 0.5; // default speed
            // below is a script for fast mode and slow mode we do not care

           if (gamepad1.square) {
               speed = 0.75;
           }
           if (gamepad1.triangle) {
               speed = 0.25;
           }
           if (gamepad1.circle) {
               speed = 1;
           }
           drive.driveRobotCentric(strafe * speed,forward * speed,turn * speed);

        }
    }
}

