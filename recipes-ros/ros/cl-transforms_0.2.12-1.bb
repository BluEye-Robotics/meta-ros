DESCRIPTION = "Homogeneous transform library for Common Lisp."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sbcl cl-utils"

RDEPENDS_${PN} = "sbcl cl-utils"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_transforms/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5055d2a4f02e52b1cb300f8f1f77915"
SRC_URI[sha256sum] = "d77a7f302eba6656005c0bb83833f61d81c0f73ea3da5297b1f8cf6f23bfee23"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_transforms-0.2.12-1"

inherit catkin
