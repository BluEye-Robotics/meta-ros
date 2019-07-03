DESCRIPTION = "ROS nodes to generate command topics for vehicles and manipulators using a joystick input"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "joy joy-teleop python-numpy sensor-msgs std-msgs geometry-msgs rospy tf uuv-gazebo-ros-plugins-msgs uuv-thruster-manager"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_teleop/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9873074d1893120e0ac7787ed20ced5"
SRC_URI[sha256sum] = "9928e88dbd74aa8548544777e90bea6dd7bf45da1d24d60072b38d97080cc0cc"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_teleop-0.6.12-0"

inherit catkin
