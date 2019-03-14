DESCRIPTION = "Client implementation to use TF2 from Common Lisp"
AUTHOR = "Georg Bartels"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp  tf2-msgs cl-transforms-stamped cl-utils"

RDEPENDS_${PN} = "actionlib-lisp  tf2-msgs cl-transforms-stamped cl-utils"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_tf2/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "723e6ee7252a0585c32786a1089ecddd"
SRC_URI[sha256sum] = "668068f24600290b0c5bc0d773d81ca3115f2085a80c58c6617f5467290b2a52"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_tf2-0.2.10-0"

inherit catkin
