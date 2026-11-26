package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class ShooterTestAuto extends OpMode {

//    DcMotor frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
//    DcMotor frontRight = hardwareMap.get(DcMotor.class, "frontRight");
//    DcMotor backLeft = hardwareMap.get(DcMotor.class, "backLeft");
//    DcMotor backRight = hardwareMap.get(DcMotor.class, "backRight");
    private DcMotor shooter = null;
    private DcMotor intake = null;
    double shooterPower = 0.6;

    @Override
    public void init() {

        shooter = hardwareMap.get(DcMotor.class, "shooter");
        intake = hardwareMap.get(DcMotor.class, "intake");
        //        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
//        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        intake.setDirection(DcMotor.Direction.REVERSE);
        shooter.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {

        shooter.setPower(shooterPower);
        intake.setPower(0.5);

        telemetry.update();
    }
}
