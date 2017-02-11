// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team2509.robot;


import org.usfirst.frc.team2509.robot.commands.ClimbUp;
import org.usfirst.frc.team2509.robot.commands.OpDrive;
import org.usfirst.frc.team2509.robot.commands.ShooterRun;
import org.usfirst.frc.team2509.robot.commands.SweeperForward;
import org.usfirst.frc.team2509.robot.commands.SweeperReverse;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick OPSTICK;
    public Joystick COOPSTICK;
    public JoystickButton CLIMB;
    public JoystickButton FORWARD_SWEEP;
    public JoystickButton REVERSE_SWEEP;
    public JoystickButton SHOOT;

	public OI() {
        OPSTICK = new Joystick(0);
        COOPSTICK = new Joystick(1);
        // SmartDashboard Buttons
        SmartDashboard.putData("OpDrive", new OpDrive());
        SmartDashboard.putData("Shooter Start", new ShooterRun());
        SmartDashboard.putData("ReverseSweep", new SweeperReverse());
        SmartDashboard.putData("Forward Sweep", new SweeperForward());
        // Joystick Buttons
        CLIMB = new JoystickButton(OPSTICK, 2);
        CLIMB.whileHeld(new ClimbUp());
        SHOOT = new JoystickButton(OPSTICK, 1);
        SHOOT.whileHeld(new ShooterRun());
        FORWARD_SWEEP = new JoystickButton(COOPSTICK,5);
        FORWARD_SWEEP.whileHeld(new SweeperForward());
        REVERSE_SWEEP = new JoystickButton(COOPSTICK, 3);
        REVERSE_SWEEP.whileHeld(new SweeperReverse());
	}
    public Joystick getOpStick() {
        return OPSTICK;
    }
    public Joystick getCoopStick(){
    	return COOPSTICK;
    }
    public double getScaledX(){
		return (OPSTICK.getX()*((OPSTICK.getRawAxis(3)+1.5)*0.4));
	}
	public double getScaledY(){
		return (OPSTICK.getY()*((OPSTICK.getRawAxis(3)+1.5)*0.4));
	}
	public double getScaledZ(){
		return (OPSTICK.getZ()*((OPSTICK.getRawAxis(3)+1)*0.5));
	}
}
