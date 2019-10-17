DESCRIPTION = "rosbuild contains scripts for managing the CMake-based build system for ROS."
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pkgconfig catkin message-generation message-runtime"

RDEPENDS_${PN} = "catkin message-generation message-runtime"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosbuild/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c30c66d1790ad76948a658ef8cb1a7fb"
SRC_URI[sha256sum] = "8271bf56c941f15351708355323ebf42ec8150d54f21402bd0c2aca5bd5c4d84"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosbuild-1.14.7-1"

inherit catkin
