DESCRIPTION = "A metapackage of Emacs utils for ROS. Only there for simplifying the release process."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosemacs roslisp-repl slime-wrapper slime-ros"

RDEPENDS_${PN} = "rosemacs roslisp-repl slime-wrapper slime-ros"

SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/ros_emacs_utils/0.4.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "01a2c1d35d2ddda2a8248de4904effba"
SRC_URI[sha256sum] = "990b5e5da666f743e90acf3e00a9cc0d41fd9c72b982b0ae09822ee6fc2635b6"

S = "${WORKDIR}/ros_emacs_utils-release-release-melodic-ros_emacs_utils-0.4.13-0"

inherit catkin
