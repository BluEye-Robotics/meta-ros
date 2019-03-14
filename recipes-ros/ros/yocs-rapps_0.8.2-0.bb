DESCRIPTION = "Yujin open control system rapps for use with the app manager and rocon concert"
AUTHOR = "Jihoon Lee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "yocs-velocity-smoother"

RDEPENDS_${PN} = "yocs-velocity-smoother"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_rapps/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a7d421bff578c1f7d2da559bfcc0d37f"
SRC_URI[sha256sum] = "2767288fa43f309509dcd227d01f558b8c28ab860a65f63e92a2456abff0b1ea"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_rapps-0.8.2-0"

inherit catkin
