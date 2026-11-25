package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class TeleOpCode extends OpMode {

    DcMotor frontLeft = hardwareMap.get(DcMotor.class,"frontLeft");
    DcMotor frontRight = hardwareMap.get(DcMotor.class,"frontRight");
    DcMotor backLeft = hardwareMap.get(DcMotor.class,"backLeft");
    DcMotor backRight = hardwareMap.get(DcMotor.class,"backRight");
    DcMotor shooter = hardwareMap.get(DcMotor.class,"shooter");
    DcMotor intake = hardwareMap.get(DcMotor.class,"intake");

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double y = -gamepad1.left_stick_y;
        double x = gamepad1.left_stick_x;
        double rx = gamepad1.right_stick_x;
        frontLeft.setPower((y + x + rx)* 0.8);
        backLeft.setPower((y - x + rx)* 0.8);
        frontRight.setPower((y - x - rx)* 0.8);
        backRight.setPower((y + x - rx)*0.8);

        if (gamepad1.right_bumper) {
            intake.setPower(0.5);
        } else if (gamepad1.left_bumper) {
            intake.setPower(-0.5);
        } else {
            intake.setPower(0);
        }

        if (gamepad1.right_trigger > 0) {
            shooter.setPower(gamepad1.right_trigger * 0.8);
        } else if  (gamepad1.left_trigger > 0) {
            shooter.setPower(gamepad1.left_trigger * -0.3);
        } else {
            shooter.setPower(0);
        }
        telemetry.update();
    }
}


