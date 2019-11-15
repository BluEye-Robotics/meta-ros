DESCRIPTION = "Loading and publishing grid maps from bag files."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-ros grid-map-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_loader/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d72cd79846eea5886ba3e69f71caaf8d"
SRC_URI[sha256sum] = "9670bfef23a27ede70e0de843882f6b641ce26c13052c1afcd5e1c741fbe6e99"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_loader-1.6.2-1"

inherit catkin
