DESCRIPTION = "Client implementation to use TF from Common Lisp"
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " cl-transforms cl-transforms-stamped tf"

RDEPENDS_${PN} = " cl-transforms cl-transforms-stamped tf"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_tf/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ffdf04370f28d2d92fe5d2ddc34d61e4"
SRC_URI[sha256sum] = "babd91787b5937bb5e3d17353dd5bded7a26a75dd62c339f51a3a3d44e137dd0"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_tf-0.2.10-0"

inherit catkin
