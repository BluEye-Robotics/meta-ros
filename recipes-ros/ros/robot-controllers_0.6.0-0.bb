DESCRIPTION = "Some basic robot controllers for use with robot_controllers_interface."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles actionlib actionlib-msgs control-msgs geometry-msgs kdl-parser nav-msgs orocos-kdl pluginlib robot-controllers-interface roscpp sensor-msgs std-msgs tf tf-conversions trajectory-msgs urdf actionlib actionlib-msgs control-msgs geometry-msgs kdl-parser nav-msgs pluginlib orocos-kdl robot-controllers-interface roscpp sensor-msgs std-msgs tf tf-conversions trajectory-msgs urdf"

RDEPENDS_${PN} = "actionlib actionlib-msgs control-msgs geometry-msgs kdl-parser nav-msgs pluginlib orocos-kdl robot-controllers-interface roscpp sensor-msgs std-msgs tf tf-conversions trajectory-msgs urdf"

SRC_URI = "https://github.com/fetchrobotics-gbp/robot_controllers-release/archive/release/melodic/robot_controllers/0.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "09a4fd5f538dcb0b0f05e434d054f099"
SRC_URI[sha256sum] = "8b8bbd122bf7977a8b16518c7eb79ad915969f5d69fed23f85100fb33f58865f"

S = "${WORKDIR}/robot_controllers-release-release-melodic-robot_controllers-0.6.0-0"

inherit catkin
