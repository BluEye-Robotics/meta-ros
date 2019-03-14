DESCRIPTION = "KDL binding for tf2"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen orocos-kdl tf2 tf2-ros libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_kdl/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ae75e28d3c8ae42630047cbb0f501d01"
SRC_URI[sha256sum] = "af0a21267f7ff0d435f5b54a3b55575e399daaf75ed8e01f09906e1b9af018cf"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_kdl-0.6.5-0"

inherit catkin
