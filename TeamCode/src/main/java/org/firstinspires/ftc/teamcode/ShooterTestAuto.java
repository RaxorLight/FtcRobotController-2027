package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class ShooterTestAuto extends OpMode {

    DcMotor frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    DcMotor frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    DcMotor backLeft = hardwareMap.get(DcMotor.class, "backLeft");
    DcMotor backRight = hardwareMap.get(DcMotor.class, "backRight");
    DcMotor shooter = hardwareMap.get(DcMotor.class, "shooter");
    DcMotor intake = hardwareMap.get(DcMotor.class, "intake");

    @Override
    public void init() {
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        intake.setDirection(DcMotorSimple.Direction.REVERSE);
        shooter.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {
        shooter.setPower(0.8);
        intake.setPower(0.5);

        telemetry.update();
    }
}
