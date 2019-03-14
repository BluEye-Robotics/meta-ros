DESCRIPTION = "The kartech_linear_actuator_msgs package"
AUTHOR = "Joshua Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/kartech_linear_actuator_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c17d6f939e66c03177280e8d7f50cdb9"
SRC_URI[sha256sum] = "be518d78afb13fdaac8bdaf0da50fcafa371660bfe03e81c4e5e231d88732d5c"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-kartech_linear_actuator_msgs-2.3.1-0"

inherit catkin
