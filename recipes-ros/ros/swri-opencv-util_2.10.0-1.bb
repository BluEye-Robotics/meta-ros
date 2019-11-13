DESCRIPTION = "swri_opencv_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge swri-math-util"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_opencv_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "29ee7f211aa287833998947ca600a36e"
SRC_URI[sha256sum] = "7ae64cc51d9fd0407bcd5739c8bd38e9ad16845ea5b969ab7b6a6be500eee91d"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_opencv_util-2.10.0-1"

inherit catkin
