DESCRIPTION = "Message definitions for map_organizer_msgs package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation nav-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/map_organizer_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2fd4254d855f565a854f9452419f11f1"
SRC_URI[sha256sum] = "1320445d272efde8b0dfa97594007ffd520c73e18c53e30bb451e52ace2c5aea"

ROS_SPN = "neonavigation_msgs"
S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-map_organizer_msgs-0.5.0-1"

inherit catkin
