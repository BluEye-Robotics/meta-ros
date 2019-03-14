DESCRIPTION = "The mcl_3dl message definition package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/at-wat/mcl_3dl_msgs-release/archive/release/melodic/mcl_3dl_msgs/0.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80a52b200cd145c8ee4d2b45875a81da"
SRC_URI[sha256sum] = "d946568df0327384e9e5e2304964454753889b4f703096a17d6d94795e64ce8a"

S = "${WORKDIR}/mcl_3dl_msgs-release-release-melodic-mcl_3dl_msgs-0.1.2-0"

inherit catkin
