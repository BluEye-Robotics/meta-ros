DESCRIPTION = "swri_roscpp"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-updater dynamic-reconfigure marti-common-msgs nav-msgs roscpp std-msgs std-srvs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_roscpp/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ffbf41cf55db0cb680972c462169e0a7"
SRC_URI[sha256sum] = "faeb241aec0c2843ecbb13a084e1db6eda22af0518b3c9df395447f339ea56aa"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_roscpp-2.10.0-1"

inherit catkin
