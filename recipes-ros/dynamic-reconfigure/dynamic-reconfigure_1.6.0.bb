DESCRIPTION = "This unary stack contains the dynamic_reconfigure package which provides a means to \
change node parameters at any time without having to restart the node."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs roslib"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "91f89bd33c43267bd3849d051cc6b320"
SRC_URI[sha256sum] = "8dad5836e6844f1ab76b1b155a9ec3f34bdaa7a5c629d6197b85c96812d8bca6"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "roslib rosservice"
