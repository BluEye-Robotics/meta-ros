DESCRIPTION = "Extra nodes and plugins for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "cmake-modules mavros roscpp geometry-msgs mavros-msgs sensor-msgs std-msgs visualization-msgs urdf tf tf2-eigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_extras/0.31.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9ef51665cfd829c322eedcebed47395d"
SRC_URI[sha256sum] = "a15c70b9a0ebf2cd8ba347ca88270609262dad6bc5d8bb7564c149fa9989e948"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_extras-0.31.0-1"

inherit catkin
