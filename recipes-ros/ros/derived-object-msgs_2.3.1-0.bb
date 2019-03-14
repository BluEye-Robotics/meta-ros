DESCRIPTION = "Abstracted Messages from Perception Modalities"
AUTHOR = "Daniel Stanek"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs geometry-msgs shape-msgs radar-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/derived_object_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a3f40084f3310b2e280c7221d8c19b6d"
SRC_URI[sha256sum] = "5b5450bf1c0968aa5b7f6190cb26b07b11563d0041e410d322ceff66567b5a23"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-derived_object_msgs-2.3.1-0"

inherit catkin
