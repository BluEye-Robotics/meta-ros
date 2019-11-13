DESCRIPTION = "Visualization configuration for Clearpath Husky"
AUTHOR = "Ryan Gariepy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch husky-description joint-state-publisher robot-state-publisher  rviz-imu-plugin"

RDEPENDS_${PN} = "husky-description joint-state-publisher robot-state-publisher  rviz-imu-plugin"

SRC_URI = "https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_viz/0.4.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9dd589e2249975ffb9969bc4d956b336"
SRC_URI[sha256sum] = "0929c37c262a5e06e49f8fe52bfaae70d7447e820fa8573a10b833ad1ec59325"

ROS_SPN = "husky"
S = "${WORKDIR}/husky-release-release-melodic-husky_viz-0.4.1-1"

inherit catkin
