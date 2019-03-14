DESCRIPTION = "Lisp client library for ROS, the Robot Operating System."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslang sbcl rospack rosgraph-msgs std-srvs"

RDEPENDS_${PN} = "roslang sbcl rospack rosgraph-msgs std-srvs"

SRC_URI = "https://github.com/ros-gbp/roslisp-release/archive/release/melodic/roslisp/1.9.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "717583e59edbf7c03721f9438881dae3"
SRC_URI[sha256sum] = "83844af11c1d8a5baf84efcef5a107629966d66b14973723446cd8803fc9781a"

S = "${WORKDIR}/roslisp-release-release-melodic-roslisp-1.9.22-0"

inherit catkin
