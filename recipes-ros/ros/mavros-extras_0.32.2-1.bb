DESCRIPTION = "Extra nodes and plugins for"
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "cmake-modules mavros roscpp geometry-msgs mavros-msgs sensor-msgs std-msgs visualization-msgs urdf tf tf2-eigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros_extras/0.32.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "22c28d130dc03b904dcc15a4d28289df"
SRC_URI[sha256sum] = "f7f1d3f35dd4c269665c64496950112e8bafd1c7d93ec39f7793f7bf22600316"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-mavros_extras-0.32.2-1"

inherit catkin
