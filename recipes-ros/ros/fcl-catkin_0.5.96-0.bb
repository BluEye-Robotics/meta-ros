DESCRIPTION = "fcl_catkin"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libccd-dev libeigen octomap"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wxmerkt/fcl_catkin-release/archive/release/melodic/fcl_catkin/0.5.96-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2d1fc5ed9a2c1e16ec93364480def9cb"
SRC_URI[sha256sum] = "1344afc22facdd951be85766ee08d3eecb88b64a915c1d4c58d7a002ef4b99a0"

S = "${WORKDIR}/fcl_catkin-release-release-melodic-fcl_catkin-0.5.96-0"

inherit catkin
