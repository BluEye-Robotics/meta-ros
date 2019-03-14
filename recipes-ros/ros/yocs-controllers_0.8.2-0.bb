DESCRIPTION = "Library for various controller types and algorithms"
AUTHOR = "Marcus Liebhardt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roscpp"

RDEPENDS_${PN} = "roscpp"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_controllers/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1c4268fcf36934bb561d73a36b36b99"
SRC_URI[sha256sum] = "f45d647a26a653328fe0a94eb13c786fe4854c891e03509806d0fa013d09f797"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_controllers-0.8.2-0"

inherit catkin
