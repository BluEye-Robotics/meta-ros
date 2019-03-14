DESCRIPTION = "Definition of the multi-layered grid map message type."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_msgs/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c759769a2bb7fe8464c82d101683eb36"
SRC_URI[sha256sum] = "0fb40a3caa90ebc1d116a96f2779e15443e7f4e3f06c96d8e3f3fd8946326c8d"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_msgs-1.6.1-0"

inherit catkin
