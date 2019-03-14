DESCRIPTION = "Meta-package for the universal grid map library."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "grid-map-core grid-map-ros grid-map-cv grid-map-msgs grid-map-filters grid-map-visualization grid-map-rviz-plugin grid-map-loader grid-map-demos"

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9204fad98b3c82d0b481c6a4707ced53"
SRC_URI[sha256sum] = "2d9508d17334621b645f0a64f156c765080d5aab918a2ebd69b7a93478e7e53a"

S = "${WORKDIR}/grid_map-release-release-melodic-grid_map-1.6.1-0"

inherit catkin
