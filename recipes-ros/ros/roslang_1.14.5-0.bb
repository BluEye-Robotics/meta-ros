DESCRIPTION = "roslang is a common package that all"
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin genmsg"

RDEPENDS_${PN} = "catkin genmsg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roslang/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4a23d3010c3de304da93166e256c5155"
SRC_URI[sha256sum] = "2cbf94e51e70a0af894f6eaf68a15759bdf9c5bfd4c7c76e1cc442aaefd0805f"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roslang-1.14.5-0"

inherit catkin
