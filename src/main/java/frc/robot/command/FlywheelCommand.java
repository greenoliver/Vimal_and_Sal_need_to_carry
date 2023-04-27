package frc.robot.command;

import org.ejml.equation.IntegerSequence.Combined;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystem.FlywheelSubsystem;

public class FlywheelCommand extends CommandBase{
    FlywheelSubsystem flywheelSubsytem;
    double speed;

    public FlywheelCommand(FlywheelSubsystem flywheelSubsystem, double speed) {
        this.flywheelSubsytem = flywheelSubsystem;
        this.speed = speed;
    }

    @Override
    public void initialize() {
        flywheelSubsytem.setShootSpeed(speed);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
