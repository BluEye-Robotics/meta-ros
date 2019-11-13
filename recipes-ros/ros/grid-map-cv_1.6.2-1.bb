DESCRIPTION = "Conversions between grid maps and OpenCV images."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core cv-bridge filters"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_cv/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2affb84822712ef9409bc9422b8c3de5"
SRC_URI[sha256sum] = "7b0ccbb9fe7b0ee3a762998a1f6bb4f7df965f707d214fe7b57914456d5c2d60"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_cv-1.6.2-1"

inherit catkin
