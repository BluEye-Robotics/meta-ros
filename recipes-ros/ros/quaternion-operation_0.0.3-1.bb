DESCRIPTION = "The quaternion_operation package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "geometry-msgs roscpp rostest libeigen geometry-msgs roscpp rostest libeigen"

RDEPENDS_${PN} = "geometry-msgs roscpp rostest libeigen"

SRC_URI = "https://github.com/OUXT-Polaris/quaternion_operation-release/archive/release/melodic/quaternion_operation/0.0.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9669189a03d1ab19435b1c4eeabfc7ca"
SRC_URI[sha256sum] = "71f1f5d9106860e969083c37f11328737229b7e9c8c1254980817016f9f52348"

S = "${WORKDIR}/quaternion_operation-release-release-melodic-quaternion_operation-0.0.3-1"

inherit catkin
