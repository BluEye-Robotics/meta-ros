DESCRIPTION = "Provides an Interface to read the sensor output of a SICK Safety Scanner"
AUTHOR = "Lennart Puck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=48a602c865794401f5c0c56e309d9596"

DEPENDS = "message-generation roscpp sensor-msgs std-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "message-runtime rqt-reconfigure"

SRC_URI = "https://github.com/SICKAG/sick_safetyscanners-release/archive/release/melodic/sick_safetyscanners/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03c92a0b2c271ab0ae5edd55e703c2bd"
SRC_URI[sha256sum] = "1704147cac2d6645162141e5474d67d5a3e63e1a52b2ac98e321b922fc5f3bbd"

S = "${WORKDIR}/sick_safetyscanners-release-release-melodic-sick_safetyscanners-1.0.2-0"

inherit catkin
