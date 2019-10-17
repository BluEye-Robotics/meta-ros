DESCRIPTION = "mavros_msgs defines messages for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "message-generation std-msgs geometry-msgs sensor-msgs geographic-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_msgs/0.31.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "13241a67ca148a17c2e93d1253bc2590"
SRC_URI[sha256sum] = "0ac3546908680ba875682324861d6653c2bfb61f86ebc4f28bb58302e5b61a79"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_msgs-0.31.0-1"

inherit catkin
