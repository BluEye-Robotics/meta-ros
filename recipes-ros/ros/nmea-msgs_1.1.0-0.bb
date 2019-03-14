DESCRIPTION = "The nmea_msgs package contains messages related to data in the NMEA format."
AUTHOR = "Eric Perko"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs message-runtime"

SRC_URI = "https://github.com/ros-drivers-gbp/nmea_msgs-release/archive/release/melodic/nmea_msgs/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ae39b772360787ab09e67a65bb3caaae"
SRC_URI[sha256sum] = "40ed33263afe8cac7ccc4b58c3458cbda636f9e4ac54475b754a3c869105ba14"

S = "${WORKDIR}/nmea_msgs-release-release-melodic-nmea_msgs-1.1.0-0"

inherit catkin
