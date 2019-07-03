DESCRIPTION = "Common libraries to control ROS based robots. This stack contains an implementation of actionlib (client and server) in Common Lisp, a transformation library and an implementation of tf in Common Lisp."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp cl-tf cl-tf2 cl-transforms cl-transforms-stamped cl-utils cl-urdf roslisp-utilities"

RDEPENDS_${PN} = "actionlib-lisp cl-tf cl-tf2 cl-transforms cl-transforms-stamped cl-utils cl-urdf roslisp-utilities"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/roslisp_common/0.2.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "255bd6fb56f6eab79e78656c9e43b82c"
SRC_URI[sha256sum] = "f21f8982fd0069e1ee3f3611877153b9b675d57b019649f9c079d6c9251a57fd"

S = "${WORKDIR}/roslisp_common-release-release-melodic-roslisp_common-0.2.12-1"

inherit catkin
