DESCRIPTION = "The SBG ROS Driver package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp sensor-msgs std-msgs std-srvs geometry-msgs message-generation roscpp sensor-msgs geometry-msgs std-msgs std-srvs message-runtime"

RDEPENDS_${PN} = "roscpp sensor-msgs geometry-msgs std-msgs std-srvs message-runtime"

SRC_URI = "https://github.com/SBG-Systems/sbg_ros_driver-release/archive/release/melodic/sbg_driver/1.1.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e5463d485ee361d4cf0deb551b2b8a5d"
SRC_URI[sha256sum] = "5dcd118009e8bd76fefe8a9abe3467f6ade59058b8ddcc4b386466c8a419be65"

S = "${WORKDIR}/sbg_ros_driver-release-release-melodic-sbg_driver-1.1.7-0"

inherit catkin
