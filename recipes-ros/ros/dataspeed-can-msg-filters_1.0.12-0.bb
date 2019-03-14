DESCRIPTION = "Time synchronize multiple CAN messages to get a single callback"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp can-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_can-release/archive/release/melodic/dataspeed_can_msg_filters/1.0.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "345d556b55bb07e4ad93e4a71ffbdaa5"
SRC_URI[sha256sum] = "042a76185f2ede3e557deb37f3dad0b56eaa8f7e25e5fa31c4d333e16c3ec082"

ROS_SPN = "dataspeed_can"
S = "${WORKDIR}/dataspeed_can-release-release-melodic-dataspeed_can_msg_filters-1.0.12-0"

inherit catkin
