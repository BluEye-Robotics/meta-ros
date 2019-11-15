DESCRIPTION = "hector_mapping is a SLAM approach that can be used without odometry as well as on platforms that exhibit roll/pitch motion (of the sensor, the platform or both). It leverages the high update rate of modern LIDAR systems like the Hokuyo UTM-30LX and provides 2D pose estimates at scan rate of the sensors (40Hz for the UTM-30LX). While the system does not provide explicit loop closing ability, it is sufficiently accurate for many real world scenarios. The system has successfully been used on Unmanned Ground Robots, Unmanned Surface Vehicles, Handheld Mapping Devices and logged data from quadrotor UAVs."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp nav-msgs visualization-msgs tf message-filters laser-geometry tf-conversions libeigen boost message-generation roscpp nav-msgs visualization-msgs tf message-filters laser-geometry tf-conversions libeigen boost message-runtime"

RDEPENDS_${PN} = "roscpp nav-msgs visualization-msgs tf message-filters laser-geometry tf-conversions libeigen boost message-runtime"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_mapping/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a1b2914c01c1247714d77e4fa0e4d02e"
SRC_URI[sha256sum] = "bc94afaf1df68b038253dca063f76b3afac667c9b0929cb648f888c147dcc81c"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_mapping-0.4.0-1"

inherit catkin
