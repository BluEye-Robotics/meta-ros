DESCRIPTION = "This package contains the xxx. machine files that describe the different hosts a node can be spawned on. Currently there is one machine file for the pr2 robot, and one for the simulated pr2 robot."
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/melodic/pr2_machine/1.12.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e306e06072217a721e8fd60f96c52d62"
SRC_URI[sha256sum] = "57a14290871112df082f51820a8adbd11dbacb0a38440c11968ec0ca80104ef4"

ROS_SPN = "pr2_common"
S = "${WORKDIR}/pr2_common-release-release-melodic-pr2_machine-1.12.4-1"

inherit catkin
