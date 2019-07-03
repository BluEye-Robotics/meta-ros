DESCRIPTION = "Implementation of TF datatypes"
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cl-transforms  geometry-msgs std-msgs"

RDEPENDS_${PN} = "cl-transforms  geometry-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_transforms_stamped/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a507f864afe72ab8ab8dd6cb3cf00b13"
SRC_URI[sha256sum] = "9b9627f15df25714fe9b26e0a2317733d94092d0f218a2824cc5caa0e8b17385"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_transforms_stamped-0.2.12-1"

inherit catkin
