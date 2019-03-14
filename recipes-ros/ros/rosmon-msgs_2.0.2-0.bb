DESCRIPTION = "		Messages for rosmon, the node launcher and monitor for ROS. 		rosmon is a replacement for the roslaunch tool, focused on performance,		remote monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_msgs/2.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "04378fdb801d8671146ca64f2bef7452"
SRC_URI[sha256sum] = "6fb5e71fbb5ab94c72316c1d653a760b4dc068026bdbb954991eed26229ef74f"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_msgs-2.0.2-0"

inherit catkin
