DESCRIPTION = ""
AUTHOR = "Dan Solomon (Southwest Research Institute)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=32;endline=32;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "abb-driver abb-resources joint-state-publisher robot-state-publisher"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb2400_support/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9ddee4a0aed6e3a92e0a6e9f6bfaebc6"
SRC_URI[sha256sum] = "12b36abb6dcc94cad69c818ec407455ceeb2411ee95d44f476af4679920e3091"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb2400_support-1.3.1-1"

inherit catkin
