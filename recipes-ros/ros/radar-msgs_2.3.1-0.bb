DESCRIPTION = "Generic Radar Messages"
AUTHOR = "Daniel Stanek"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/radar_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d27213b899b85616dff8521ca94e0f46"
SRC_URI[sha256sum] = "ef32eb400ff896750907c99abf7c31091f742b43a1bd011b35c15ee14deb5304"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-radar_msgs-2.3.1-0"

inherit catkin
