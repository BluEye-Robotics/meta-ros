DESCRIPTION = "osg_utils is a library that contains some classes that may be useful in ROS-OSG applications."
AUTHOR = "Mario Prats"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp libopenscenegraph geometry-msgs tf roscpp libopenscenegraph geometry-msgs tf"

RDEPENDS_${PN} = "roscpp libopenscenegraph geometry-msgs tf"

SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/melodic/osg_utils/1.0.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f9fd631befef535714a1d8fc0063d3a"
SRC_URI[sha256sum] = "44b9e6940bfb07236c1f66596c82406b2ef5d9df2be508248d24b560d31ac7f5"

ROS_SPN = "visualization_osg"
S = "${WORKDIR}/visualization_osg-release-release-melodic-osg_utils-1.0.2-2"

inherit catkin
