DESCRIPTION = ""
AUTHOR = "Dan Solomon (Southwest Research Institute)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=32;endline=32;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "abb-driver joint-state-publisher robot-state-publisher"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb6600_support/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9fe45e53e0140f8c27eaa773d2ff7702"
SRC_URI[sha256sum] = "716570b9fc635318552ee21e2c6fa50287d700464f7790a09e8fb812f8be880b"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb6600_support-1.3.1-1"

inherit catkin
