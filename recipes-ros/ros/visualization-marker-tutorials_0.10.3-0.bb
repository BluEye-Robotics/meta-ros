DESCRIPTION = "The visulalization_marker_tutorials package"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp visualization-msgs roscpp visualization-msgs"

RDEPENDS_${PN} = "roscpp visualization-msgs"

SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/melodic/visualization_marker_tutorials/0.10.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0aecb304824e0dcca7a3b81461329432"
SRC_URI[sha256sum] = "2e5bc745ab400757dee1666b765a9aef01a4d9b5f062d837827aee336bdbb68d"

ROS_SPN = "visualization_tutorials"
S = "${WORKDIR}/visualization_tutorials-release-release-melodic-visualization_marker_tutorials-0.10.3-0"

inherit catkin
