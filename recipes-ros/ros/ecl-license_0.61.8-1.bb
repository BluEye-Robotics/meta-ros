DESCRIPTION = "Maintains the ecl licenses and also provides an install target for deploying licenses with the ecl libraries."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=3;endline=3;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/melodic/ecl_license/0.61.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "28a099d670ed1dbe86081785a70d0994"
SRC_URI[sha256sum] = "812ed1887128fee8dc1d288ca24063ed4402e00bb128aa23a0f57fd7cdfaef9e"

ROS_SPN = "ecl_tools"
S = "${WORKDIR}/ecl_tools-release-release-melodic-ecl_license-0.61.8-1"

inherit catkin
