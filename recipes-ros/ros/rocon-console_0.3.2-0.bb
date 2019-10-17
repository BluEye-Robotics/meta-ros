DESCRIPTION = "Command line python console utilities (mostly for colourisation)."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-catkin-pkg"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_console/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bcae0e9b34d748fa02e956ee4b57aeca"
SRC_URI[sha256sum] = "f9c8de84b23bb19b26971bf0e516cee5c1af7509519db44874fc8c062a742684"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_console-0.3.2-0"

inherit catkin
