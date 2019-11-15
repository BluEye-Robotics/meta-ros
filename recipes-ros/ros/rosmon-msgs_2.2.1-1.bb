DESCRIPTION = "		Messages for rosmon, the node launcher and monitor for ROS. 		rosmon is a replacement for the roslaunch tool, focused on performance,		remote monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_msgs/2.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b374a5639e55ac8b9fd52b3805169e3c"
SRC_URI[sha256sum] = "03fbf2130f728808cc6eed9eb770b6e9674befdcad75a0a6677f874d3857c463"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_msgs-2.2.1-1"

inherit catkin
