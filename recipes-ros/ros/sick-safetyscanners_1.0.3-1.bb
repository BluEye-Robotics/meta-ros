DESCRIPTION = "Provides an Interface to read the sensor output of a SICK Safety Scanner"
AUTHOR = "Lennart Puck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=48a602c865794401f5c0c56e309d9596"

DEPENDS = "message-generation roscpp sensor-msgs std-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "message-runtime rqt-reconfigure"

SRC_URI = "https://github.com/SICKAG/sick_safetyscanners-release/archive/release/melodic/sick_safetyscanners/1.0.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "65150fe66077e0d288393b5004690145"
SRC_URI[sha256sum] = "31590fabcaa361afbf00a61ee073377bc003ad595053f3887c2b415d33290e28"

S = "${WORKDIR}/sick_safetyscanners-release-release-melodic-sick_safetyscanners-1.0.3-1"

inherit catkin
