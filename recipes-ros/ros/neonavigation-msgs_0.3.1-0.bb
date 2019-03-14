DESCRIPTION = "Message definitions for neonavigation package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "planner-cspace-msgs costmap-cspace-msgs map-organizer-msgs trajectory-tracker-msgs"

SRC_URI = "https://github.com/at-wat/neonavigation_msgs-release/archive/release/melodic/neonavigation_msgs/0.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "75487a57c2fce33f912aa4fe6fa715db"
SRC_URI[sha256sum] = "7d971fab567d6f8c40daf97a1d1c7a8251a23576fa5a69396babfa98813ada18"

S = "${WORKDIR}/neonavigation_msgs-release-release-melodic-neonavigation_msgs-0.3.1-0"

inherit catkin
