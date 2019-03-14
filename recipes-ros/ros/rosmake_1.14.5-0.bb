DESCRIPTION = "rosmake is a ros dependency aware build tool which can be used to build all dependencies in the correct order."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-rospkg"

RDEPENDS_${PN} = "catkin python-rospkg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosmake/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f9e0c39c8c354f82909515ba8303131"
SRC_URI[sha256sum] = "c6ed915b5e3c20331ca22d1e23adfeb94844f6ae7e6df75ee256a5c666f4f75d"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosmake-1.14.5-0"

inherit catkin
