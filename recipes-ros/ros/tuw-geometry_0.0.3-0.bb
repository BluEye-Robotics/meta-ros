DESCRIPTION = "The tuw_geometry package"
AUTHOR = "Markus Bader"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen boost cv-bridge roscpp rospy std-msgs roscpp rospy std-msgs cv-bridge"

RDEPENDS_${PN} = "roscpp rospy std-msgs cv-bridge"

SRC_URI = "https://github.com/tuw-robotics/tuw_geometry-release/archive/release/melodic/tuw_geometry/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9035d04f4a7d8a49a224e4d2a399002b"
SRC_URI[sha256sum] = "96df80626ab8ecd101acb1f972c815be0d105e9e5539e73d691ea3b2ef5d3e84"

S = "${WORKDIR}/tuw_geometry-release-release-melodic-tuw_geometry-0.0.3-0"

inherit catkin
