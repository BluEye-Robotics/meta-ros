DESCRIPTION = "This package provides access to the PR2 fingertip pressure sensors. This information includes:"
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs geometry-msgs rostest message-generation std-msgs pr2-msgs rospy geometry-msgs visualization-msgs message-runtime"

RDEPENDS_${PN} = "std-msgs pr2-msgs rospy geometry-msgs visualization-msgs message-runtime"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/fingertip_pressure/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1e5ff6b4de438fef4e0ae10cfcac796"
SRC_URI[sha256sum] = "b4ed5a369a34c342f410d4fbfb050d286cb4ff8db96482684e0e6354c66e5ac5"

ROS_SPN = "pr2_ethercat_drivers"
S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-fingertip_pressure-1.8.18-0"

inherit catkin
