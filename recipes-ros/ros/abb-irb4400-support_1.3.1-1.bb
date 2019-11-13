DESCRIPTION = ""
AUTHOR = "Dan Solomon"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=29;endline=29;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "abb-driver abb-resources joint-state-publisher robot-state-publisher  xacro"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb4400_support/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "410988b56201089e850b48969704af90"
SRC_URI[sha256sum] = "49a2d88c75c80ea8234b1e32f6d0307a2a1c4f6d570255c1eb66f8945314ab6a"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb4400_support-1.3.1-1"

inherit catkin
