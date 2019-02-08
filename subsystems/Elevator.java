package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Elevator extends Subsystem{
    
    WPI_TalonSRX liftMaster = RobotMap.liftMaster;
    WPI_TalonSRX liftSlave = RobotMap.liftSlave;

    public Elevator(){
        liftSlave.follow(liftMaster);
    }
    
    
    public void initDefaultCommand(){

    }
}