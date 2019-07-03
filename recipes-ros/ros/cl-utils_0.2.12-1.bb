DESCRIPTION = "Common Lisp utility libraries"
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sbcl"

RDEPENDS_${PN} = "sbcl"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_utils/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a3189cc0b9a6ea6f9fb555722b4e65c"
SRC_URI[sha256sum] = "d481e48d5fb6872e3be0fd8ec67fdcf061299f7e5153e3edbf7dc0b33f3343b8"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_utils-0.2.12-1"

inherit catkin
