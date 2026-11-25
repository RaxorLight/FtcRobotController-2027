package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class ShooterTestAuto extends OpMode {

    DcMotor frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
    DcMotor frontRight = hardwareMap.get(DcMotor.class, "frontRight");
    DcMotor backLeft = hardwareMap.get(DcMotor.class, "backLeft");
    DcMotor backRight = hardwareMap.get(DcMotor.class, "backRight");
    DcMotor

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}
