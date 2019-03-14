DESCRIPTION = "rosbuild contains scripts for managing the CMake-based build system for ROS."
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pkgconfig catkin message-generation message-runtime"

RDEPENDS_${PN} = "catkin message-generation message-runtime"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosbuild/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9a101030189f12eb80138325a07cec48"
SRC_URI[sha256sum] = "41a3105aa5a36baa2398a63d73f6b16935c1b4e4705a1f070ab58164475b0871"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosbuild"

inherit catkin
