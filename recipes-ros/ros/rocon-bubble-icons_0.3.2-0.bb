DESCRIPTION = "Bubble icon library for rocon."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-catkin-pkg"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_bubble_icons/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bb9f674cdac1702e5a5bb1754c66e4d2"
SRC_URI[sha256sum] = "4f454f561a9f325246e487e1499d05c6c43cf16aac9a4926029211f8c41b6ad1"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_bubble_icons-0.3.2-0"

inherit catkin
