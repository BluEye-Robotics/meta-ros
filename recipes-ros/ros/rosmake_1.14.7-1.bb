DESCRIPTION = "rosmake is a ros dependency aware build tool which can be used to build all dependencies in the correct order."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "catkin python-rospkg python3-rospkg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosmake/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd91514dd481358bfcfbae3e4b27c07a"
SRC_URI[sha256sum] = "002be3a8cc840df70a0499cf6b14a090cdc330f486315b90547c72f3d20fd679"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosmake-1.14.7-1"

inherit catkin
