DESCRIPTION = "Extra nodes and plugins for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "cmake-modules mavros roscpp geometry-msgs mavros-msgs sensor-msgs std-msgs visualization-msgs urdf tf tf2-eigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_extras/0.29.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "be55fd463dff9320592bd524d854f326"
SRC_URI[sha256sum] = "1331ad93923e651a54cf17a666cb86b3b16d94255a4dbcb73dadc6cef75d487c"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_extras-0.29.2-0"

inherit catkin
