DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing data structures and mapping algorithms in C++. The map implementation is based on an octree. See http://octomap. github. io for details."
AUTHOR = "Kai M. Wurm"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/melodic/octomap/1.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "44ce06123a97e3cb90ebd0cf22fbc154"
SRC_URI[sha256sum] = "20a5bb7d159129053c2b25f7c02a76ad4ffec83c31e2fb4486753c88115caee6"

S = "${WORKDIR}/octomap-release-release-melodic-octomap-1.9.0-1"

inherit catkin
