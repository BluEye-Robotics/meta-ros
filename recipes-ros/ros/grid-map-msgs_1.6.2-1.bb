DESCRIPTION = "Definition of the multi-layered grid map message type."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_msgs/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "109e4262ebf588fe8e1ba19c1b96e1b7"
SRC_URI[sha256sum] = "62a81de064e4c4fd392aa41cc3a97fb792e8f0b17edddab32e20200e5101694a"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_msgs-1.6.2-1"

inherit catkin
