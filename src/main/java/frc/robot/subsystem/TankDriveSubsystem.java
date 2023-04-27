package frc.robot.subsystem;

import frc.robot.components.TalonSRXComponent;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TankDriveSubsystem extends SubsystemBase {
    private TalonSRXComponent leftMotor;
    private TalonSRXComponent rightMotor;

    public TankDriveSubsystem() {
        leftMotor = new TalonSRXComponent(Constants.DRIVE_LEFT_MOTOR_ID);
        rightMotor = new TalonSRXComponent(Constants.DRIVE_RIGHT_MOTOR_ID);
    }

    public void setRightMotor(double speed) {
        rightMotor.setOutput(speed);
    }
    public void setLeftMotor(double speed) {
        leftMotor.setOutput(speed);
    }
}