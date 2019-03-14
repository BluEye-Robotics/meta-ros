DESCRIPTION = "This package pulls in the Karto mapping library, and provides a ROS wrapper for using it."
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "cmake-modules libeigen message-filters nav-msgs open-karto rosconsole roscpp sparse-bundle-adjustment sensor-msgs tf visualization-msgs libeigen message-filters nav-msgs open-karto rosconsole roscpp sparse-bundle-adjustment sensor-msgs tf visualization-msgs"

RDEPENDS_${PN} = "libeigen message-filters nav-msgs open-karto rosconsole roscpp sparse-bundle-adjustment sensor-msgs tf visualization-msgs"

SRC_URI = "https://github.com/ros-gbp/slam_karto-release/archive/release/melodic/slam_karto/0.8.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "92146d6603533718383657285f5857a5"
SRC_URI[sha256sum] = "5a602df47e9778bf47a4e51c2e263c27188f949686e525bb8a446c2eb6637eea"

S = "${WORKDIR}/slam_karto-release-release-melodic-slam_karto-0.8.1-0"

inherit catkin
