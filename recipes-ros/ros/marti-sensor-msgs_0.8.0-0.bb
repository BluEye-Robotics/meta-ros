DESCRIPTION = "marti_sensor_msgs"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_sensor_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "19b6201762efc913af98e07c9e3c517b"
SRC_URI[sha256sum] = "9838c4fcde586606bd556cfcb68ec801885228022c4b8e8bd721dbf18f7d88ea"

ROS_SPN = "marti_messages"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_sensor_msgs-0.8.0-0"

inherit catkin
