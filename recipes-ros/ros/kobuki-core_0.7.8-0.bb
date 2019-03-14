DESCRIPTION = "Non-ROS software for Kobuki, Yujin Robot's mobile research base."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "kobuki-dock-drive kobuki-driver kobuki-ftdi"

RDEPENDS_${PN} = "kobuki-dock-drive kobuki-driver kobuki-ftdi"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_core/0.7.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "820706a701c9fa31e8b120d5852e6cfe"
SRC_URI[sha256sum] = "56089bc142fb63afa805b19d543123c28f51feee8e17bdd730908310345ac292"

S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_core-0.7.8-0"

inherit catkin
