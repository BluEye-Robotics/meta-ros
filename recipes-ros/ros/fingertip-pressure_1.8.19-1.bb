DESCRIPTION = "This package provides access to the PR2 fingertip pressure sensors. This information includes:"
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs geometry-msgs rostest message-generation std-msgs pr2-msgs rospy geometry-msgs visualization-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs pr2-msgs rospy geometry-msgs visualization-msgs message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/fingertip_pressure/1.8.19-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e9ee2f35594746f3f6eee65ec46eef64"
SRC_URI[sha256sum] = "24a090d31a677615de660c07ec0bc95bb80e2896d95455b806f3116c1ceb5c23"

ROS_SPN = "pr2_ethercat_drivers"
S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-fingertip_pressure-1.8.19-1"

inherit catkin
