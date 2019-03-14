DESCRIPTION = "Conversions between grid maps and OpenCV images."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core cv-bridge filters"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_cv/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d815354121b4ac3f6d4f9a2897518b1b"
SRC_URI[sha256sum] = "210414e554f115a4a3f7cfea79893dd64203fed6be95e45a81509e70aac4845e"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_cv-1.6.1-0"

inherit catkin
