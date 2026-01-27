// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;

/** Add your docs here. */
public class Constants {
        
    public static class motorIDs{

    }

    public static class hubPositionRED {
        public static final Pose2d RedHub = new Pose2d(11.912,4.024, Rotation2d.fromDegrees(0));
    }

    public static class hubPositionBLUE{
        public static final Pose2d BlueHub = new Pose2d(4.628,4.024, Rotation2d.fromDegrees(-180));
    }

    public static final double HUB_red_X = 0;
}
