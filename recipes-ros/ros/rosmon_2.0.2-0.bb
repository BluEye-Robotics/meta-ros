DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "rosmon-core rqt-rosmon"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon/2.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "baf2ba93e0f12f53a3149e88b5857400"
SRC_URI[sha256sum] = "86889a64f484e3a77ff9c176c3c47c185e7c2d1e6a748885e2f658344bbad92a"

S = "${WORKDIR}/rosmon-release-release-melodic-rosmon-2.0.2-0"

inherit catkin
