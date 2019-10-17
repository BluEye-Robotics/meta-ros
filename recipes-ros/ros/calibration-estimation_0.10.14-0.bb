DESCRIPTION = "Runs an optimization to estimate the a robot's kinematic parameters. This package is a generic rewrite of pr2_calibration_estimation."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "calibration-msgs python3-matplotlib python3-orocos-kdl python3-scipy rospy rostest sensor-msgs urdfdom-py visualization-msgs"

RDEPENDS_${PN} = "calibration-msgs python3-matplotlib python3-orocos-kdl python3-scipy rospy rostest sensor-msgs urdfdom-py visualization-msgs"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration_estimation/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9224bd7729da163f6465ede4df955f86"
SRC_URI[sha256sum] = "b6d902974beb94a2868f04a7c820517a153083bf0c316b91036a746a411a2970"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-calibration_estimation-0.10.14-0"

inherit catkin
