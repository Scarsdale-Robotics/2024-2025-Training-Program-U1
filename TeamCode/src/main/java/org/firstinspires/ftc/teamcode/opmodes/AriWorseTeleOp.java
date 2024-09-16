package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.HardwareRobot;
import org.firstinspires.ftc.teamcode.subsystems.DriveSubsystem;

@TeleOp(name="Ari's Worse TeleOp")
public class AriWorseTeleOp extends LinearOpMode {

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
        boolean a = false;
        double bumpspeed = 0.6;
        while (opModeIsActive()) {
            double strafe = gamepad1.left_stick_x;
            double forward = gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;
            if (gamepad1.a) {
                a = !a;
            }
            if(a){
                drive.driveRobotCentric(bumpspeed*strafe, bumpspeed*forward, turn);
            }
            else {
                drive.driveRobotCentric(strafe, forward, turn);
            }
        }
    }
}

