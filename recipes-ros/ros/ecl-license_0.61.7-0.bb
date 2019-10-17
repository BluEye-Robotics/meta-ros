DESCRIPTION = "Maintains the ecl licenses and also provides an install target for deploying licenses with the ecl libraries."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=3;endline=3;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/melodic/ecl_license/0.61.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5d7c891a4b950e5e12802fb2246ea6a"
SRC_URI[sha256sum] = "ed382fc26835b422b7315c1162c6fcf591b8243be2822b44eaf9a55ffc6529e0"

ROS_SPN = "ecl_tools"
S = "${WORKDIR}/ecl_tools-release-release-melodic-ecl_license-0.61.7-0"

inherit catkin
