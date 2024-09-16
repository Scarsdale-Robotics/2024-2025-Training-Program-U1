package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.sun.source.tree.WhileLoopTree;

import org.firstinspires.ftc.teamcode.HardwareRobot;
import org.firstinspires.ftc.teamcode.subsystems.DriveSubsystem;

@TeleOp(name = "Luke's TeleOp")
public class LukeLiuTeleOp extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException{
        HardwareRobot robot = new HardwareRobot(hardwareMap);
        DriveSubsystem drive = new DriveSubsystem(
                robot.leftFront,
                robot.rightFront,
                robot.leftBack,
                robot.rightBack
        );

        waitForStart();

        while(opModeIsActive()){
            drive.driveRobotCentric(1,1,1);
            drive.driveRobotCentric(1,1,1);
            drive.driveRobotCentric(1,1,1);
            drive.driveRobotCentric(1,1,1);
        }
        while(opModeIsActive()){
            double strafe = gamepad1.left_stick_x;
            double forward = gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;
            drive.driveRobotCentric(strafe, forward, turn);
        }

    }

}
