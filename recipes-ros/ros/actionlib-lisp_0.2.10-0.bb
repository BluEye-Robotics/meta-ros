DESCRIPTION = "actionlib_lisp is a native implementation of the famous actionlib in Common Lisp. It provides a client and a simple server."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " cl-utils actionlib-msgs message-runtime"

RDEPENDS_${PN} = " cl-utils actionlib-msgs message-runtime"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/actionlib_lisp/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "74f5a2d8fba8c79aeabd4b1cb87336ce"
SRC_URI[sha256sum] = "f7d69b33db5ed3ca13e17699bb8ec2fb18612b3f193f7bbaa46b9be73877a7bc"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-actionlib_lisp-0.2.10-0"

inherit catkin
