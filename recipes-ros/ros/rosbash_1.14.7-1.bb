DESCRIPTION = "Assorted shell commands for using ros with bash."
AUTHOR = "Jeremy Leibs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin rospack"

RDEPENDS_${PN} = "catkin rospack"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosbash/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5c265a30543fd725f7407bd445b1e4ec"
SRC_URI[sha256sum] = "c5c7174151d0762d82f64f7d9e8f1c43755b7e4973eb9c9bd5ae36c311737838"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosbash-1.14.7-1"

inherit catkin
