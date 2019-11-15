DESCRIPTION = "hector_map_server provides a service for retrieving the map, as well as for raycasting based obstacle queries (finds next obstacle in the map, given start and endpoint in any tf coordinate frame)."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp hector-map-tools hector-marker-drawing hector-nav-msgs nav-msgs tf roscpp hector-map-tools hector-marker-drawing hector-nav-msgs nav-msgs tf"

RDEPENDS_${PN} = "roscpp hector-map-tools hector-marker-drawing hector-nav-msgs nav-msgs tf"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_map_server/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ae627297068ead29302bcfd871d18303"
SRC_URI[sha256sum] = "b86414ff423348c86a9084d947ae80233e141f01394254ed5a424cfd84c9227e"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_map_server-0.4.0-1"

inherit catkin
