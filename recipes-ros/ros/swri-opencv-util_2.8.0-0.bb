DESCRIPTION = "swri_opencv_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge swri-math-util"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_opencv_util/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a6e9f3545e4cb37b909f3b648894dd90"
SRC_URI[sha256sum] = "1300a00f92191a4558880a4849e8daff33a53e12e1c10c43e6782bb99bf5eeef"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_opencv_util-2.8.0-0"

inherit catkin
