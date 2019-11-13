DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "rosmon-core rqt-rosmon"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon/2.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "865edde2a015dbda3e882364d8aa477d"
SRC_URI[sha256sum] = "7294462ecc50fb638016cefea6f43c40fe45799bbb9088e8b3c7d71aaf7905ec"

S = "${WORKDIR}/rosmon-release-release-melodic-rosmon-2.2.1-1"

inherit catkin
