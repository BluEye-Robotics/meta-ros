DESCRIPTION = "cl_urdf"
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " cl-transforms"

RDEPENDS_${PN} = " cl-transforms"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_urdf/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6b9c14fcf43e756f04d1b8c04f76f94"
SRC_URI[sha256sum] = "d2b3ee247057cc0bee65484510f44e0342fff7fc1efcbfc4545914edf5efaa72"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_urdf-0.2.10-0"

inherit catkin
