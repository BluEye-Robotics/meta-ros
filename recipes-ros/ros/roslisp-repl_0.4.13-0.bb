DESCRIPTION = "This package provides a script that launches Emacs with Slime (the Superior Lisp Interaction Mode) ready for Lisp development and roslisp."
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=90cf8e14bb501c1f6d3eda81e45e438a"

DEPENDS = "slime-wrapper slime-ros sbcl  rosemacs"

RDEPENDS_${PN} = "slime-wrapper slime-ros sbcl  rosemacs"

SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/roslisp_repl/0.4.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fc5a134e92414f3dfadf80aed6d59d81"
SRC_URI[sha256sum] = "8a3c6a1532c2cda1967b880e2a26474c04966c606d4cf5ef5a1fcbe65f2ccc7f"

ROS_SPN = "ros_emacs_utils"
S = "${WORKDIR}/ros_emacs_utils-release-release-melodic-roslisp_repl-0.4.13-0"

inherit catkin
