DESCRIPTION = "Interface for grid maps to the costmap_2d format."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core costmap-2d tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_costmap_2d/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c1ef2ca478ea71d4efbbf5ba56df1717"
SRC_URI[sha256sum] = "540826a6431bd931bdb478756ef566b76e5ddad01b15d84ebc6803048efab182"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_costmap_2d-1.6.1-0"

inherit catkin
