DESCRIPTION = "The quaternion_operation package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "geometry-msgs roscpp rostest libeigen geometry-msgs roscpp rostest libeigen"

RDEPENDS_${PN} = "geometry-msgs roscpp rostest libeigen"

SRC_URI = "https://github.com/OUXT-Polaris/quaternion_operation-release/archive/release/melodic/quaternion_operation/0.0.3-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5031ccc6a97592fe3dc00023ad0c4bc2"
SRC_URI[sha256sum] = "db2cc70403a27df5a67db21c742c28728723a67b4c8f0ab51384e99d6692b32f"

S = "${WORKDIR}/quaternion_operation-release-release-melodic-quaternion_operation-0.0.3-2"

inherit catkin
