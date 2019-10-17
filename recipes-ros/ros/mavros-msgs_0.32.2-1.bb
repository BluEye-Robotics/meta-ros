DESCRIPTION = "mavros_msgs defines messages for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "message-generation std-msgs geometry-msgs sensor-msgs geographic-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_msgs/0.32.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21cb033b9193f4818f116df79d94f0fb"
SRC_URI[sha256sum] = "530fd380a93ae86f677b04add4379a2f30702af17562b4a45e571470f9b53d55"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_msgs-0.32.2-1"

inherit catkin
