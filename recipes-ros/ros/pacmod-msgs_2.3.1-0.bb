DESCRIPTION = "Message definition files for the PACMod driver"
AUTHOR = "Josh Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/pacmod_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0782692bb07d4cfb6c18c9dd3680ac44"
SRC_URI[sha256sum] = "cfdcb09b275da8304f367682c9d46fb3f02008e741a8634b67fd235f443c0a08"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-pacmod_msgs-2.3.1-0"

inherit catkin
