DESCRIPTION = "swri_opencv_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge swri-math-util"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_opencv_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "414ff2992a66d4a613f02168dbe1eaad"
SRC_URI[sha256sum] = "a3af76e9699e6aab99f6b3aa1bd30bda26b310fb4a2e630e1a1cbb22fb6b40b6"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_opencv_util-2.9.0-1"

inherit catkin
