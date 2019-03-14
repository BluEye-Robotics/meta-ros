DESCRIPTION = "Search and approach behaviour, moving to a target in front of a pair of ar markers."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy std-msgs geometry-msgs tf dynamic-reconfigure"

RDEPENDS_${PN} = "rospy std-msgs geometry-msgs tf dynamic-reconfigure"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_ar_pair_approach/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a544539efb7f47c4edc7825a95268263"
SRC_URI[sha256sum] = "57ea6195fb9edc5fd0e5a0e89a7c82773a4a809b56a85fa6cd396c88bbd5a6f9"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_ar_pair_approach-0.8.2-0"

inherit catkin
