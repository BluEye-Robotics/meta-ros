DESCRIPTION = "This package contains a C++ parser for the Unified Robot Description Format (URDF), which is an XML format for representing a robot model. The code API of the parser has been through our review process and will remain backwards compatible in future releases."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdfdom urdfdom-headers rosconsole-bridge roscpp urdf-parser-plugin pluginlib cmake-modules libtinyxml libtinyxml2 libtinyxml libtinyxml2 urdfdom-headers"

RDEPENDS_${PN} = "urdfdom rosconsole-bridge roscpp pluginlib libtinyxml libtinyxml2"

SRC_URI = "https://github.com/ros-gbp/urdf-release/archive/release/melodic/urdf/1.13.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ab3e046cb4b2d41c94f4f753fbd5bfc"
SRC_URI[sha256sum] = "2d16536bc8a59e01339b034539828f411245a3b170abc65d8e1f99f1305ae4f0"

S = "${WORKDIR}/urdf-release-release-melodic-urdf-1.13.1-0"

inherit catkin
