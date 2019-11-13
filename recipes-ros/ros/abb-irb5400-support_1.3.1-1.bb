DESCRIPTION = ""
AUTHOR = "Dan Solomon (Southwest Research Institute)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=28;endline=28;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "abb-driver abb-resources joint-state-publisher robot-state-publisher"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb5400_support/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bac475c387d862262dab0024ffb49db6"
SRC_URI[sha256sum] = "6755bde5b9794edba2c80fcfc27fc7c5eb8e3cdd992d8da9bbc4a8c907139f5c"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb5400_support-1.3.1-1"

inherit catkin
