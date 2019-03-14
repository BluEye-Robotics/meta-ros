DESCRIPTION = "turtlebot3_follow_filter package using laser_filters for turtlebot3_follower package"
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "laser-filters"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_follow_filter/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d5107e79f93bed8fc3702435cd421a33"
SRC_URI[sha256sum] = "a97a63ec2370bbc67e7270c6aa1d5efca85134228642ac263e9a6d2ccef39f45"

ROS_SPN = "turtlebot3_applications"
S = "${WORKDIR}/turtlebot3_applications-release-release-melodic-turtlebot3_follow_filter-1.1.0-0"

inherit catkin
