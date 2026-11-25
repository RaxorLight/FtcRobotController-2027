package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "cherry tutorial")
public class cherry_tutorial extends OpMode {

    int int_Variable;
    int int_Variable2 = 2;
    double double_variable = 3.0;
    double double_variable2;
    String string_variable = "this is a variable";
    boolean cherry_has_food;



    @Override
    public void init() {
        int_Variable = 1;
        double_variable2 = 4;
        int_Variable2 = 17;
        cherry_has_food = true;
        cherry_has_food = false;
    }

    @Override
    public void loop() {

    }
}
