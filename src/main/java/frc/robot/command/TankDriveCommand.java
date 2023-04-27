package frc.robot.command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystem.TankDriveSubsystem;

public class TankDriveCommand extends CommandBase {
    private TankDriveSubsystem m_tankDrive;
    private CommandXboxController m_controller;

    public TankDriveCommand(TankDriveSubsystem tankDriveSubsystem, CommandXboxController controller) {
        m_tankDrive = tankDriveSubsystem;
        m_controller = controller;
    }

    /** Oliver was here */
    @Override
    public void execute() {
        m_tankDrive.setLeftMotor(-m_controller.getLeftY());
        m_tankDrive.setRightMotor(-m_controller.getRightY());
    }
}
