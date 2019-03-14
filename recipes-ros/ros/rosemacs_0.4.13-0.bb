DESCRIPTION = "ROS tools for those who live in Emacs."
AUTHOR = "Bhaskara Marthi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "emacs"

RDEPENDS_${PN} = "emacs"

SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/rosemacs/0.4.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7f9386edd204ce08c8987eabc5c2af0"
SRC_URI[sha256sum] = "80a2911c8cf86b70a771060e8304d9234b375b2f221fb42e63bfe5bfbf8f36a1"

ROS_SPN = "ros_emacs_utils"
S = "${WORKDIR}/ros_emacs_utils-release-release-melodic-rosemacs-0.4.13-0"

inherit catkin
