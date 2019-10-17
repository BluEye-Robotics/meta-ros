DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "rosmon-core rqt-rosmon"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon/2.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7bf839fdeaf46cea49888e77edfc4bed"
SRC_URI[sha256sum] = "cd26c93fdcf7a7ea7c743a1debb5d0c2ab2848eae7f1b66ca953b413f910f4b6"

S = "${WORKDIR}/rosmon-release-release-melodic-rosmon-2.1.1-1"

inherit catkin
