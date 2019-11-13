DESCRIPTION = "Meta-package for the universal grid map library."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "grid-map-core grid-map-ros grid-map-cv grid-map-msgs grid-map-filters grid-map-visualization grid-map-rviz-plugin grid-map-loader grid-map-demos"

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a3b829512f4b028aa62f6113a6f1bb7c"
SRC_URI[sha256sum] = "e5d635fb7cda75a2d873d37d108fac9e1bd382ad552426cafd70bbe2222b7fc3"

S = "${WORKDIR}/grid_map-release-release-melodic-grid_map-1.6.2-1"

inherit catkin
