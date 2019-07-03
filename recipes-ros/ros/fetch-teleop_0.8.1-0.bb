DESCRIPTION = "Teleoperation for fetch and freight."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib control-msgs geometry-msgs nav-msgs roscpp sensor-msgs topic-tools"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_teleop/0.8.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e54f362d7e2cd0d0f014ba5176112691"
SRC_URI[sha256sum] = "cfb1141e6a532b67af9d7435c2797936e24fd9d2661a6327a3ad785be4bf33a4"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_teleop-0.8.1-0"

inherit catkin
