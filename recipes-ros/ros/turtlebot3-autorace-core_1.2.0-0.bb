DESCRIPTION = "TurtleBot3 AutoRace ROS package that TurtleBot3 Auto's core"
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy roslaunch std-msgs python3-numpy python3-enum34"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_autorace-release/archive/release/melodic/turtlebot3_autorace_core/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c2d00aa5c8d8639b25a5e8a981848e92"
SRC_URI[sha256sum] = "cd350672e9b7912409d33cd0e9f7f0deccddc9eac9999778f9fe08f0ea81912d"

ROS_SPN = "turtlebot3_autorace"
S = "${WORKDIR}/turtlebot3_autorace-release-release-melodic-turtlebot3_autorace_core-1.2.0-0"

inherit catkin
