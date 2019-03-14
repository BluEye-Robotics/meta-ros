DESCRIPTION = "Common Lisp utility libraries"
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sbcl"

RDEPENDS_${PN} = "sbcl"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_utils/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e0648dc010c455f407a46607c7c952b8"
SRC_URI[sha256sum] = "e77a28e37781eac7f3e75193f0c6adb099a860976fd96677baa28b11bfc21e44"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_utils-0.2.10-0"

inherit catkin
