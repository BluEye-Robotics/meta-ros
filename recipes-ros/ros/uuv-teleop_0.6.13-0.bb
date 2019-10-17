DESCRIPTION = "ROS nodes to generate command topics for vehicles and manipulators using a joystick input"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "joy joy-teleop python3-numpy sensor-msgs std-msgs geometry-msgs rospy tf uuv-gazebo-ros-plugins-msgs uuv-thruster-manager"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_teleop/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "792561716c5ef15da7f21ea338de3a31"
SRC_URI[sha256sum] = "f3bae248754ff04b19bfb6f9575218cc77f9a682426fd3716082098ea055ddfd"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_teleop-0.6.13-0"

inherit catkin
