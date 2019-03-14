DESCRIPTION = "A teleoperation node for the p2os_driver package."
AUTHOR = "Hunter L. Allen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs tf std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_teleop/2.1.1-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a8c5563b7b02d0013162b2cab2a47b52"
SRC_URI[sha256sum] = "f263fffb042a86ffea63279e319c18b59efe102b6ad0f0d2f868ddd86e754fc2"

ROS_SPN = "p2os"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_teleop-2.1.1-3"

inherit catkin
