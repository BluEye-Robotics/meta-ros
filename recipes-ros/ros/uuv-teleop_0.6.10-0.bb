DESCRIPTION = "ROS nodes to generate command topics for vehicles and manipulators using a joystick input"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "joy joy-teleop python-numpy sensor-msgs std-msgs geometry-msgs rospy tf uuv-gazebo-ros-plugins-msgs uuv-thruster-manager"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_teleop/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba54028f2378967fe653c03be041da37"
SRC_URI[sha256sum] = "f06e793b68098a59a9a92b347cd2691a914ae5cb0b52209153e6a2b36a41ea3b"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_teleop-0.6.10-0"

inherit catkin
