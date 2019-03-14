DESCRIPTION = "Unit-testing package for ROS. This is a lower-level library for rostest and handles unit tests, whereas rostest handles integration tests."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg roslib"

RDEPENDS_${PN} = "python-rospkg roslib"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosunit/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "be785f5009465b6f62df8478e32603be"
SRC_URI[sha256sum] = "0bb5572c505a4c0ced8985ab975351bd0091a3a064db922b01d081115fa7d4fa"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosunit"

inherit catkin
