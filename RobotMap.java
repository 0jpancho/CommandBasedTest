/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SerialPort;
import frc.robot.util.PIDF;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static final int leftMasterPort = 2;
  public static final int leftSlavePort = 1;
  public static final int rightMasterPort = 3;
  public static final int rightSlavePort = 4;

  public static final int liftMasterPort = 5;
  public static final int liftSlavePort = 6;

  public static WPI_TalonSRX leftMaster = new WPI_TalonSRX(RobotMap.leftMasterPort);
  public static WPI_TalonSRX leftSlave = new WPI_TalonSRX(RobotMap.leftSlavePort);

  public static WPI_TalonSRX rightMaster = new WPI_TalonSRX(RobotMap.rightMasterPort);
  public static WPI_TalonSRX rightSlave = new WPI_TalonSRX(RobotMap.rightSlavePort);

  public static WPI_TalonSRX liftMaster = new WPI_TalonSRX(RobotMap.liftMasterPort);
  public static WPI_TalonSRX liftSlave = new WPI_TalonSRX(RobotMap.liftSlavePort);

  public static AHRS navx = new AHRS(SerialPort.Port.kMXP);

  public static final double ppr = 4096;
  public final double wheelDiameter = 6;
	public final double wheelCircumference = wheelDiameter * Math.PI;
  public final double gearRatio = 1;

  public final double inchesPerRev = (wheelCircumference * gearRatio) / ppr;

  public PIDF turnCoefficients = new PIDF (0.5, 0, 0, 0);

}
