DESCRIPTION = "cl_urdf"
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " cl-transforms"

RDEPENDS_${PN} = " cl-transforms"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_urdf/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f66740bf766a94c2f855dd4f9aa04841"
SRC_URI[sha256sum] = "8fa0621108c3226d84f6ff36088c8fa3786387778ff598a0c4caf1eee4579ce5"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_urdf-0.2.12-1"

inherit catkin
