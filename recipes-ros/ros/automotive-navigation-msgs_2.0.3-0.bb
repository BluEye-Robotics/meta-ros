DESCRIPTION = "Generic Messages for Navigation Objectives in Automotive Automation Software"
AUTHOR = "Daniel Stanek"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/automotive_autonomy_msgs-release/archive/release/melodic/automotive_navigation_msgs/2.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "080003acc644447f1c6ec660c157512c"
SRC_URI[sha256sum] = "c47b3746216db63830a678b6d220f7f39bacebe9980d4fa40aeb106012873da1"

ROS_SPN = "automotive_autonomy_msgs"
S = "${WORKDIR}/automotive_autonomy_msgs-release-release-melodic-automotive_navigation_msgs-2.0.3-0"

inherit catkin
