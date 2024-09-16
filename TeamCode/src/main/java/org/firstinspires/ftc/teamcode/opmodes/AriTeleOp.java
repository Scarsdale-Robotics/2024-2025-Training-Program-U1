package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.HardwareRobot;
import org.firstinspires.ftc.teamcode.subsystems.DriveSubsystem;

@TeleOp(name="Ari's TeleOp")
public class AriTeleOp extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        HardwareRobot robot = new HardwareRobot(hardwareMap);
        DriveSubsystem drive = new DriveSubsystem(
                robot.leftFront,
                robot.rightFront,
                robot.leftBack,
                robot.rightBack
        );
        waitForStart();

        double horconst = 2*Math.random()-1;
        double verconst = 2*Math.random()-1;
        double turnconst = 2*Math.random()-1;
        while (opModeIsActive()) {
            double strafe = horconst*gamepad1.left_stick_x;
            double forward = verconst*gamepad1.left_stick_y;
            double turn = turnconst*gamepad1.right_stick_x;
            drive.driveRobotCentric(strafe, forward, turn);
        }
    }
}