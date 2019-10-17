DESCRIPTION = "rosmake is a ros dependency aware build tool which can be used to build all dependencies in the correct order."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-rospkg"

RDEPENDS_${PN} = "catkin python-rospkg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosmake/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7287e75b4dd00da9951138dcbb5b5499"
SRC_URI[sha256sum] = "2014461723eb619c99a70d3314a6e392e922a27d17fc9bc5a83292c8dfd0d591"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosmake-1.14.6-0"

inherit catkin
