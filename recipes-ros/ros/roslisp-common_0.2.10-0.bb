DESCRIPTION = "Common libraries to control ROS based robots. This stack contains an implementation of actionlib (client and server) in Common Lisp, a transformation library and an implementation of tf in Common Lisp."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-lisp cl-tf cl-tf2 cl-transforms cl-transforms-stamped cl-utils cl-urdf roslisp-utilities"

RDEPENDS_${PN} = "actionlib-lisp cl-tf cl-tf2 cl-transforms cl-transforms-stamped cl-utils cl-urdf roslisp-utilities"

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/roslisp_common/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3a0bf0c218d66a30febba0ce9826b78c"
SRC_URI[sha256sum] = "08017837c37e5b4edb4a27ebe6c26b7468afca2ce261104cdbf22df54d044491"

S = "${WORKDIR}/roslisp_common-release-release-melodic-roslisp_common-0.2.10-0"

inherit catkin
