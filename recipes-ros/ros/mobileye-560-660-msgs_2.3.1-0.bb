DESCRIPTION = "Message definitions for the Mobileye 560/660"
AUTHOR = "Josh Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/mobileye_560_660_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b41315d1be0c7244bc52497dc4adbc2c"
SRC_URI[sha256sum] = "8b04f0cb7b653492bdffead10bf58a81273782d2c80128de999cad8a460c2f2e"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-mobileye_560_660_msgs-2.3.1-0"

inherit catkin
