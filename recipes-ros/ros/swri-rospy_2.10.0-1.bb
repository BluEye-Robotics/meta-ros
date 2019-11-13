DESCRIPTION = "This package provides added functionaliy on top of rospy, including a single-threaded callback queue."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy std-msgs std-srvs"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_rospy/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8291b12ccdf8b639a1d454633b3dc62d"
SRC_URI[sha256sum] = "03ec10fcd453af08c6185c92a4cab432ed480a36cd0222b5205da13fa023aed0"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_rospy-2.10.0-1"

inherit catkin
