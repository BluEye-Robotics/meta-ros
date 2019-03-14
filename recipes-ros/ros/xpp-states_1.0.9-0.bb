DESCRIPTION = "Common definitions (positions, velocities, angular angles, angular rates) and robot definitions in Cartesian and joint state used in the Xpp Motion Framework, as well as conversions to/from xpp_msgs."
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/melodic/xpp_states/1.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "259179413b4d01acceb4d207fdf3c42b"
SRC_URI[sha256sum] = "dd438deb5015cdeb271107a8b8b3b1feb538d6b95704f1cf050e2f5545247e79"

ROS_SPN = "xpp"
S = "${WORKDIR}/xpp-release-release-melodic-xpp_states-1.0.9-0"

inherit catkin
