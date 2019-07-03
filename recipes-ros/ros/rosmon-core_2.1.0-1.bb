DESCRIPTION = "		Node launcher and monitor for ROS. rosmon is a replacement		for the roslaunch tool, focused on performance, remote		monitoring, and usability."
AUTHOR = "Max Schwarz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "python boost cmake-modules libncurses-dev rosfmt rospack roslib rosmon-msgs roscpp rosbash std-msgs libtinyxml yaml-cpp diagnostic-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosmon-release/archive/release/melodic/rosmon_core/2.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b0dcebd73a5c03bdffc2e29ddc74c2e6"
SRC_URI[sha256sum] = "21ed77f22694094baca1c763445ca6547a1fcc4d493bf26c53454dc7fab213c5"

ROS_SPN = "rosmon"
S = "${WORKDIR}/rosmon-release-release-melodic-rosmon_core-2.1.0-1"

inherit catkin
