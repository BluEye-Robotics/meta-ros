DESCRIPTION = "This library provides a standardized interface for processing data as a sequence of filters. This package contains a base class upon which to build specific implementations as well as an interface which dynamically loads filters based on runtime parameters."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslib rosconsole roscpp pluginlib rostest roslib rosconsole roscpp pluginlib"

RDEPENDS_${PN} = "roslib rosconsole roscpp pluginlib"

SRC_URI = "https://github.com/ros-gbp/filters-release/archive/release/melodic/filters/1.8.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ebb7ea94ead71c5d1a5990dbce28a75"
SRC_URI[sha256sum] = "850380ab0564923c37a6ee93227fe934647a1c4e5dfb4c5d2502f156b6b17d3f"

S = "${WORKDIR}/filters-release-release-melodic-filters-1.8.1-0"

inherit catkin
