package frc.robot.subsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.components.TalonSRXComponent;
import frc.robot.Constants;

public class FlywheelSubsystem extends SubsystemBase{
    private TalonSRXComponent upperWheel;
    private TalonSRXComponent lowerWheel;

    public FlywheelSubsystem() {
        upperWheel = new TalonSRXComponent(Constants.DRIVE_UPPER_WHEEL_ID);
        lowerWheel = new TalonSRXComponent(Constants.DRIVE_LOWER_WHEEL_ID);
        lowerWheel.setInverted(true);
    }

    public void setUpperWheel(double speed) {
        upperWheel.setOutput(speed);
    }
    public void setLowerWheel(double speed) {
        lowerWheel.setOutput(speed);
    }

    public void setShootSpeed(double speed) {
        setUpperWheel(speed);
        setLowerWheel(speed);
    }
}
