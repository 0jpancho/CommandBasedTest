package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SerialPort.Port;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import frc.robot.RobotMap;

public class DriveTrain extends PIDSubsystem{

    WPI_TalonSRX leftMaster = RobotMap.leftMaster;
    WPI_TalonSRX leftSlave = RobotMap.leftSlave;

    WPI_TalonSRX rightMaster = RobotMap.rightMaster;
    WPI_TalonSRX rightSlave = RobotMap.rightSlave; 
    
    AHRS navx = RobotMap.navx;
    
    public DriveTrain(){
        super("Drive Train", 0.01, 0, 0);

        leftSlave.follow(leftMaster);
        rightSlave.follow(rightMaster);

        setAbsoluteTolerance(2);
        getPIDController().setContinuous(true);
        LiveWindow.addActuator("Turn Drive Train", "Turn PID Controller", getPIDController());
    }

    @Override
    protected double returnPIDInput() {
        return navx.getYaw();
    }

    @Override
    protected void usePIDOutput(double output) {
        leftMaster.pidWrite(output);
        rightMaster.pidWrite(output);
    }

    @Override
    protected void initDefaultCommand() {

    }

}