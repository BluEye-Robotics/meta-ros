DESCRIPTION = "A (to be) generic joystick interface to control a robot"
AUTHOR = "Paul Mathieu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib sensor-msgs rospy rostopic teleop-tools-msgs"

RDEPENDS_${PN} = "actionlib sensor-msgs rospy rostopic teleop-tools-msgs"

SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/melodic/joy_teleop/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "281e0d8a31913f4207682ae3d8046bc7"
SRC_URI[sha256sum] = "36f191ff3945af0b25a599fecf08a999b1d7bdf91e0f387775a3e6adda9be052"

ROS_SPN = "teleop_tools"
S = "${WORKDIR}/teleop_tools-release-release-melodic-joy_teleop-0.3.0-0"

inherit catkin
