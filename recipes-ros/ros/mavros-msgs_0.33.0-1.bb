DESCRIPTION = "mavros_msgs defines messages for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "message-generation std-msgs geometry-msgs sensor-msgs geographic-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_msgs/0.33.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b71ecc546eb0ebf7b7c1abf18e7389b"
SRC_URI[sha256sum] = "295ad7d61aeacb2bea8b053b24999208ecea25604271d7b412bba3657d87a909"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_msgs-0.33.0-1"

inherit catkin
