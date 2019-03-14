DESCRIPTION = "mavros_msgs defines messages for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "message-generation std-msgs geometry-msgs sensor-msgs geographic-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_msgs/0.29.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e00d91bfcda4e2cf5f48086992e4f833"
SRC_URI[sha256sum] = "80cdf9f83bf0b611e8b08201b461ca0b73909bc211c66176e64a13ee9e0143ab"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_msgs-0.29.2-0"

inherit catkin
