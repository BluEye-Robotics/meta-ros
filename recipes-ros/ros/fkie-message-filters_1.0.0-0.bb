DESCRIPTION = "Improved ROS message filters"
AUTHOR = "Timo Röhling"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "image-transport roscpp sensor-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fkie-release/message_filters-release/archive/release/melodic/fkie_message_filters/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a7842733a0f8af5b3f85fbeb692b8384"
SRC_URI[sha256sum] = "938b5bff6f2fb9ec9e2fe36b383f0b81828c5147f0870cda2650b2cc863e2652"

S = "${WORKDIR}/message_filters-release-release-melodic-fkie_message_filters-1.0.0-0"

inherit catkin
