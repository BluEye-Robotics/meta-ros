DESCRIPTION = "TurtleBot3 AutoRace ROS package that controls Raspberry Pi Camera, and process the image"
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "dynamic-reconfigure"

RDEPENDS_${PN} = "rospy sensor-msgs cv-bridge  python-numpy python-enum34"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_autorace-release/archive/release/melodic/turtlebot3_autorace_camera/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "01b06d48ad31f5b7cfb7d3a7d44ca95f"
SRC_URI[sha256sum] = "fe6adfc679b7e08c054367e89c6a94da5cbecbd7f51411298fd4d795c61138de"

ROS_SPN = "turtlebot3_autorace"
S = "${WORKDIR}/turtlebot3_autorace-release-release-melodic-turtlebot3_autorace_camera-1.2.0-0"

inherit catkin
