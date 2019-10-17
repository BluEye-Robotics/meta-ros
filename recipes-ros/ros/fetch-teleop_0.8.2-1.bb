DESCRIPTION = "Teleoperation for fetch and freight."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib control-msgs geometry-msgs nav-msgs roscpp sensor-msgs topic-tools"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_teleop/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bee5788bae29590e20d161c5f8306f4d"
SRC_URI[sha256sum] = "1dda678e097766b8ada664db041b3e591fb58d2441ccbfd11e91dabf3a6354a4"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_teleop-0.8.2-1"

inherit catkin
