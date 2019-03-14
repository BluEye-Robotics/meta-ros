DESCRIPTION = "Loading and publishing grid maps from bag files."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-ros grid-map-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_loader/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a710b972fccbb9db12352bafa860dc8"
SRC_URI[sha256sum] = "933535f2c73fb43bc6502d724b03e684683ccdc476dce5b3b602ed7a4a0e60d1"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_loader-1.6.1-0"

inherit catkin
