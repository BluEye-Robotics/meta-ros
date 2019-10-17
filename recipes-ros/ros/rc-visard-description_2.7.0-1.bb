DESCRIPTION = "Visualization package for rc_visard"
AUTHOR = "Monika Florek-Jasinska"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard_description/2.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f09e84ac77060ac3256534d2cd7d6ef5"
SRC_URI[sha256sum] = "e5e3ac9e99aa611ee63be549bbafc932e15b7497daf5ec4ff05023891bdab04d"

ROS_SPN = "rc_visard"
S = "${WORKDIR}/rc_visard-release-release-melodic-rc_visard_description-2.7.0-1"

inherit catkin
