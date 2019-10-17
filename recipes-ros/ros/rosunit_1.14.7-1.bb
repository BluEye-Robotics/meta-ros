DESCRIPTION = "Unit-testing package for ROS. This is a lower-level library for rostest and handles unit tests, whereas rostest handles integration tests."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python3-rospkg python3-rospkg roslib"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosunit/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a39bb306bfbc2b77c5ded5c48d4c779d"
SRC_URI[sha256sum] = "3d8896cfa0f8b96666cc2749a7e3eb30a8ee522f76ff6b5282cbc1da5c2be81a"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosunit-1.14.7-1"

inherit catkin
