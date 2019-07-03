DESCRIPTION = "Client implementation to use TF2 from Common Lisp"
AUTHOR = "Georg Bartels"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp  tf2-msgs cl-transforms-stamped cl-utils"

RDEPENDS_${PN} = "actionlib-lisp  tf2-msgs cl-transforms-stamped cl-utils"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/cl_tf2/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ccb24cf73f5f384c5ed9616c875cabad"
SRC_URI[sha256sum] = "3ef1ab744ff67f4a1b6a34194055decc9d0e6c7b5b53e5054ed00808661cbbdc"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-cl_tf2-0.2.12-1"

inherit catkin
