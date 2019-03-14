DESCRIPTION = "Contains scripts that are useful as prefix commands for nodes started by roslaunch."
AUTHOR = "Elliot Johnson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "python-psutil"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_prefix_tools/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6a672a7b19ee81ca38208ce8a9ebdc96"
SRC_URI[sha256sum] = "46d09ae89612b3b84d929e357a45c69e5e2258f62dd7bbb0e22adfa5724dea6d"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_prefix_tools-2.8.0-0"

inherit catkin
