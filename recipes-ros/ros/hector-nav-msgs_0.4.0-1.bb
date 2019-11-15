DESCRIPTION = "hector_nav_msgs contains messages and services used in the hector_slam stack."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-msgs geometry-msgs message-generation nav-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "nav-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_nav_msgs/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d277c124d97b469ab3e39a93a63b944a"
SRC_URI[sha256sum] = "d0d37e5ad6c0e3802a5d08ceb5c97cd6baa5d8c9e7b9f889e10f5e3c4ceb7d5f"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_nav_msgs-0.4.0-1"

inherit catkin
