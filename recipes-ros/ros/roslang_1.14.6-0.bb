DESCRIPTION = "roslang is a common package that all"
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin genmsg"

RDEPENDS_${PN} = "catkin genmsg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roslang/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d2555b46fa07dcef60b3b0cffcab30fc"
SRC_URI[sha256sum] = "147d2f848b96ebd2b38f17bd62b485e3b213c1ac672c497d5216038f5c5f5bda"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roslang-1.14.6-0"

inherit catkin
