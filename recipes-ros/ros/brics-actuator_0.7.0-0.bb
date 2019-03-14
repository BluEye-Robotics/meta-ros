DESCRIPTION = "Message defined in the BRICS project"
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs geometry-msgs message-generation std-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/wnowak/brics_actuator-release/archive/release/melodic/brics_actuator/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "79345b7fa05371abdfeea7874344808e"
SRC_URI[sha256sum] = "20a7643aa378c2f934d712eb798a3ad3a89e86728e22da9debfae0c62eb6294f"

S = "${WORKDIR}/brics_actuator-release-release-melodic-brics_actuator-0.7.0-0"

inherit catkin
