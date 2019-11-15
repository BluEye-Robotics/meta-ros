DESCRIPTION = "hector_marker_drawing provides convenience functions for easier publishing of visualization markers."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp visualization-msgs libeigen roscpp visualization-msgs libeigen"

RDEPENDS_${PN} = "roscpp visualization-msgs libeigen"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_marker_drawing/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6a008aac771c6bbec89e1f251160f85"
SRC_URI[sha256sum] = "087fbe514f592a80d5a3d7b8bb7e4a39aefbb7b4930b4d056bfc1fc6d5113cd3"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_marker_drawing-0.4.0-1"

inherit catkin
