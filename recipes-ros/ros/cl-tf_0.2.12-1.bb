DESCRIPTION = "Client implementation to use TF from Common Lisp"
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " cl-transforms cl-transforms-stamped tf"

RDEPENDS_${PN} = " cl-transforms cl-transforms-stamped tf"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_tf/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "14ce8836fd04f47e0246b47953ef6602"
SRC_URI[sha256sum] = "53c3fc04760efac2a3158663f7c6fe4cfe74533606c9337cfb602afdc19d082d"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_tf-0.2.12-1"

inherit catkin
