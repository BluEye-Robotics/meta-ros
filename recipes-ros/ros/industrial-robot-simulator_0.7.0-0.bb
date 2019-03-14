DESCRIPTION = "The industrial robot simulator is a stand in for industrial robot driver node(s). It adheres to the driver specification for industrial robot controllers."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "control-msgs industrial-msgs industrial-robot-client python-rospkg rospy sensor-msgs trajectory-msgs"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_robot_simulator/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d64ebbe4cf2df2c5f39d926a4a4c6e0d"
SRC_URI[sha256sum] = "48bcc0aeacff43ba149a6320ff4e61271a7f2b1aa41309d7ac6b5dce3123db6e"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_robot_simulator-0.7.0-0"

inherit catkin
