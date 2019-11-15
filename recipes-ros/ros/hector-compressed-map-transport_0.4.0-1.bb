DESCRIPTION = "hector_compressed_map_transport provides means for transporting compressed map data through the use of image_transport."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge geometry-msgs hector-map-tools image-transport nav-msgs sensor-msgs libeigen cv-bridge geometry-msgs hector-map-tools image-transport nav-msgs sensor-msgs libeigen"

RDEPENDS_${PN} = "cv-bridge geometry-msgs hector-map-tools image-transport nav-msgs sensor-msgs libeigen"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_compressed_map_transport/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0c570aff48dfc6631fb870a144ca0a49"
SRC_URI[sha256sum] = "3be26fd7806ed4e643de57b603bb8b7fb8e4bdd46a6484d77d3c5ff113d4b391"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_compressed_map_transport-0.4.0-1"

inherit catkin
