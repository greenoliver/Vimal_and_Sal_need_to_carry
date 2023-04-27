package frc.robot;

import javax.swing.text.TabExpander;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.command.FlywheelCommand;
import frc.robot.command.TankDriveCommand;
import frc.robot.subsystem.FlywheelSubsystem;
import frc.robot.subsystem.TankDriveSubsystem;
import frc.robot.subsystem.FlywheelSubsystem;


public class RobotContainer {
    private SendableChooser<Command> autonChooser = new SendableChooser<Command>();
    private CommandXboxController controller = new CommandXboxController(2);
    private TankDriveSubsystem tankDriveSubsystem = new TankDriveSubsystem();
    private TankDriveCommand tankDriveCommand;
    private FlywheelSubsystem flywheelSubsystem = new FlywheelSubsystem();
    private Trigger shootButtonTrigger = controller.leftBumper();

    public RobotContainer() {
        configureAuto();
        configureTankDrive();
        configureShooter();
        
    }
    /**Sal helped a lot */
    public void configureTankDrive() {
        tankDriveCommand = new TankDriveCommand(tankDriveSubsystem, controller);
        tankDriveSubsystem.setDefaultCommand(tankDriveCommand);
    }
    
    public void configureAuto() {
        autonChooser.setDefaultOption("No Auto", null);
    }

    public void configureShooter() {
        shootButtonTrigger.toggleOnTrue(new FlywheelCommand(flywheelSubsystem, 1));
        shootButtonTrigger.toggleOnFalse(new FlywheelCommand(flywheelSubsystem, 0));
    }

    public Command getAutonomousCommand() {
        return autonChooser.getSelected();
    }

    public void teleopInit() {
        Command auton = autonChooser.getSelected();
        if (auton != null) {
            auton.cancel();
        }
    }

}