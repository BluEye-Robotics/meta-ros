DESCRIPTION = "fcl_catkin"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libccd-dev libeigen octomap"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wxmerkt/fcl_catkin-release/archive/release/melodic/fcl_catkin/0.5.98-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72ea7d0d9dff2983dd04a3d6674543ae"
SRC_URI[sha256sum] = "4a5b800bcbb6e3c017962cc5a2583ee005a7090798e8ccfd520140d396c5a427"

S = "${WORKDIR}/fcl_catkin-release-release-melodic-fcl_catkin-0.5.98-1"

inherit catkin
