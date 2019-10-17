DESCRIPTION = "rosbuild contains scripts for managing the CMake-based build system for ROS."
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pkgconfig catkin message-generation message-runtime"

RDEPENDS_${PN} = "catkin message-generation message-runtime"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosbuild/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "74ec4da1832e25f3c7264befda9ccc21"
SRC_URI[sha256sum] = "3c95011a3c521dc30e8b7f4399fdc46f0e3702978b9060f309529e6e8f396e43"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosbuild-1.14.6-0"

inherit catkin
