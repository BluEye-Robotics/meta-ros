DESCRIPTION = "ROS wrapper for slime"
AUTHOR = ""
SECTION = "devel"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=90cf8e14bb501c1f6d3eda81e45e438a"

DEPENDS = "emacs"

RDEPENDS_${PN} = "emacs"

SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/melodic/slime_wrapper/0.4.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6fd3180461e0df5a40122281f3f60863"
SRC_URI[sha256sum] = "e2a2cbbdcc477518699369b9a35fdfb1dd21ca3e9fed2615fe87c1a5fea1eea5"

ROS_SPN = "ros_emacs_utils"
S = "${WORKDIR}/ros_emacs_utils-release-release-melodic-slime_wrapper-0.4.13-0"

inherit catkin
