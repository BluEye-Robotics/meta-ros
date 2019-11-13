DESCRIPTION = "Provides teleoperation using keyboard for TurtleBot3."
AUTHOR = "Melonee Wise"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy geometry-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_teleop/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9bb8f29cb2cba0a0bab794d912408625"
SRC_URI[sha256sum] = "01ce2cef1cd4e647d29f0e6395b65078e7cabb623c9283b1b54dbf07581d725e"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_teleop-1.2.2-1"

inherit catkin
