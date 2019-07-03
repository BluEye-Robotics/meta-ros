DESCRIPTION = "Assorted shell commands for using ros with bash."
AUTHOR = "Jeremy Leibs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin rospack"

RDEPENDS_${PN} = "catkin rospack"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosbash/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "be2e1100278862070ac61b18940a0b28"
SRC_URI[sha256sum] = "8aa3f8849a9e6f158a85db00420299e5f3fc31222ccaf53dc025904548535bcb"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosbash-1.14.6-0"

inherit catkin
