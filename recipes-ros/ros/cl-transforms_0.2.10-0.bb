DESCRIPTION = "Homogeneous transform library for Common Lisp."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sbcl cl-utils"

RDEPENDS_${PN} = "sbcl cl-utils"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_transforms/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd07eaf9e8de5c11abf26d991bc3d683"
SRC_URI[sha256sum] = "cfb2f58621330690fb1aede02cff56e91d5c94b75e2a2a36d891521bfb718aa1"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_transforms-0.2.10-0"

inherit catkin
