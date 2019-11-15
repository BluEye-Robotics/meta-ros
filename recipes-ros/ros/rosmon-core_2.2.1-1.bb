DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "python boost cmake-modules libncurses-dev rosfmt rospack roslib rosmon-msgs roscpp rosbash std-msgs libtinyxml yaml-cpp diagnostic-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_core/2.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2e830820724276529ec1f26accf72c2f"
SRC_URI[sha256sum] = "6bea6d7cce29cd3b2b77b1f26a06e9b7052aea9fbb5fcbec280711fbdb87687a"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_core-2.2.1-1"

inherit catkin
