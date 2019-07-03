DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "rosmon-core rqt-rosmon"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon/2.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1b3c5d2888ee9788893bedd421e740c8"
SRC_URI[sha256sum] = "111e9623e3b434115e052d9300e22af9e2624bd86386ed62208dc018c90bbcb7"

S = "${WORKDIR}/rosmon-release-release-melodic-rosmon-2.1.0-1"

inherit catkin
