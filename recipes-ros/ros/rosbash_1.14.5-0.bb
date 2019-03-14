DESCRIPTION = "Assorted shell commands for using ros with bash."
AUTHOR = "Jeremy Leibs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin rospack"

RDEPENDS_${PN} = "catkin rospack"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosbash/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1005c0df863a630d573f5d208099842"
SRC_URI[sha256sum] = "148bfef8e525ea9af755bb6c45773e3eed5f9d3b8db313532b6cf6c1d7ee464d"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosbash-1.14.5-0"

inherit catkin
