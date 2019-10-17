DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "python boost cmake-modules libncurses-dev rosfmt rospack roslib rosmon-msgs roscpp rosbash std-msgs libtinyxml yaml-cpp diagnostic-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_core/2.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fec83c4bf2cdd2254a591019b01e6a77"
SRC_URI[sha256sum] = "eda6b1f4a31cac71c3f3f46bd154284891ce44f8f406cf165d64a1b008785b2e"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_core-2.1.1-1"

inherit catkin
