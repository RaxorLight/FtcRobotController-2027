package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Test")
public class Test extends OpMode {

    DcMotor motor;
    DcMotor motor2;

    @Override
    public void init() {

        motor = hardwareMap.get(DcMotor.class, "Motor");
        motor2= hardwareMap.get(DcMotor.class, "Motor 2");
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            motor.setPower(1);
        }

    }
}
