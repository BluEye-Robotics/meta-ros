DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "python boost cmake-modules libncurses-dev rosfmt rospack roslib rosmon-msgs roscpp rosbash std-msgs libtinyxml yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_core/2.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9ade9c3c57dd8f00439b446b7d26e2f8"
SRC_URI[sha256sum] = "c9df5410c3df7a9dcb31b219add879887508c4e2208206df6291389a8d4ed682"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_core-2.0.2-0"

inherit catkin
