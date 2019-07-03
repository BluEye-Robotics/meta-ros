DESCRIPTION = "actionlib_lisp is a native implementation of the famous actionlib in Common Lisp. It provides a client and a simple server."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " cl-utils actionlib-msgs message-runtime"

RDEPENDS_${PN} = " cl-utils actionlib-msgs message-runtime"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/actionlib_lisp/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e3e4546ad774b095b58e584a5188741"
SRC_URI[sha256sum] = "3002af2921ba296af1c5e75037094a24ae484f5cddae30abc5e6ff681669b280"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-actionlib_lisp-0.2.12-1"

inherit catkin
