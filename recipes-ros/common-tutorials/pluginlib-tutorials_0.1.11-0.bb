DESCRIPTION = "pluginlib_tutorials ROS package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"
SRC_URI[md5sum] = "b69da7ebfc00a157529fab2e5a8cdbbb"
SRC_URI[sha256sum] = "2a421d7ea4d04ba27c7221abd753f1ebbe040227df1e4c87a3df559064002c17"

DEPENDS = "roscpp pluginlib"

S = "${WORKDIR}/${ROS_SPN}-release-release-melodic-${ROS_BPN}-${PV}"

require common-tutorials.inc
