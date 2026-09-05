package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "tutorial")
public class tutorial extends OpMode {

    int integer_variable;
    int second_variable = 2;
    double double_variable = 0.1234567890;
    String string_variable = "string";

    boolean bool_variable = true;

    public void init() {
        integer_variable = 1;
        string_variable = "string2";
        bool_variable = false;
    }

    @Override
    public void loop() {
        if (integer_variable == 1)  {
            integer_variable = 2;

        } else if (integer_variable == 2) {
            integer_variable = 1;

        } else {
            integer_variable = 0;
        }

        if (gamepad1.y) {
            //activate this code
        }
        if (gamepad1.left_trigger > 0.5) {
            //activate this code
        }

        if (gamepad1.right_stick_x > 1) {
            //activate this code
        }
        if (gamepad2.a) {
            //activate this code

        }

    }
}
