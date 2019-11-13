DESCRIPTION = "Improved ROS message filters"
AUTHOR = "Timo Röhling"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "image-transport roscpp sensor-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fkie-release/message_filters-release/archive/release/melodic/fkie_message_filters/1.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0838c78896f46cc5bcd9c9c04002e075"
SRC_URI[sha256sum] = "f74c85e13e3cb79ccc878ea661f148342a3b408ddae95d2d723fa072177f03b4"

S = "${WORKDIR}/message_filters-release-release-melodic-fkie_message_filters-1.0.1-1"

inherit catkin
