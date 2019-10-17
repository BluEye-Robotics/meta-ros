DESCRIPTION = "industrial robot client contains generic clients for connecting to industrial robot controllers with servers that adhere to the simple message protocol."
AUTHOR = "Jeremy Zoss"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs control-msgs trajectory-msgs simple-message actionlib-msgs actionlib urdf industrial-msgs industrial-utils"

RDEPENDS_${PN} = "robot-state-publisher"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_robot_client/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "342e29568f85bb5bd11dc2b570464385"
SRC_URI[sha256sum] = "704f56ecf96f294b7b4805415320179fd1ac6244e309fd0a6d1cc69d4f90c18d"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_robot_client-0.7.1-1"

inherit catkin
