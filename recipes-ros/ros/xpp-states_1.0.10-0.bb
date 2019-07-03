DESCRIPTION = "Common definitions (positions, velocities, angular angles, angular rates) and robot definitions in Cartesian and joint state used in the Xpp Motion Framework, as well as conversions to/from xpp_msgs."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_states/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "54ca6bc3cc68e677a4077e90d6275517"
SRC_URI[sha256sum] = "7844597910c688e3ae3664b58bf6d3f17f0364d049d890156ed4675a2a2825f9"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_states-1.0.10-0"

inherit catkin
