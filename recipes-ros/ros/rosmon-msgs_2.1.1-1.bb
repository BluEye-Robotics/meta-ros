DESCRIPTION = "		Messages for rosmon, the node launcher and monitor for ROS. 		rosmon is a replacement for the roslaunch tool, focused on performance,		remote monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_msgs/2.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eadda6b0c68f580d6ef5c1130d2c0118"
SRC_URI[sha256sum] = "e0d2bdc8b92bf37d1742516bd955115f7c4d3743146224c56d612eb34328aea4"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_msgs-2.1.1-1"

inherit catkin
