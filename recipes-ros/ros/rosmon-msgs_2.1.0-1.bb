DESCRIPTION = "		Messages for rosmon, the node launcher and monitor for ROS. 		rosmon is a replacement for the roslaunch tool, focused on performance,		remote monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_msgs/2.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0cf5f0cbc0bfba46d12998bc97ba1986"
SRC_URI[sha256sum] = "2f1c5a62830fba9a6847742f6e40293d799dc1a780913e9ee6a499794c802699"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_msgs-2.1.0-1"

inherit catkin
